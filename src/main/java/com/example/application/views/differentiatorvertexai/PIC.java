package com.example.application.views.differentiatorvertexai;

import com.google.api.client.util.Base64;
import com.google.cloud.aiplatform.util.ValueConverter;
import com.google.cloud.aiplatform.v1.EndpointName;
import com.google.cloud.aiplatform.v1.PredictResponse;
import com.google.cloud.aiplatform.v1.PredictionServiceClient;
import com.google.cloud.aiplatform.v1.PredictionServiceSettings;
import com.google.cloud.aiplatform.v1.schema.predict.instance.ImageClassificationPredictionInstance;
import com.google.cloud.aiplatform.v1.schema.predict.params.ImageClassificationPredictionParams;
import com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult;
import com.google.protobuf.Value;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class PIC {

    

    static String predictImageClassification(String project, String fileName, String endpointId)
    throws IOException {
      PredictionServiceSettings settings = PredictionServiceSettings.newBuilder().setEndpoint("us-central1-aiplatform.googleapis.com:443").build();


  try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create(settings)) {
          String location = "us-central1";
          EndpointName endpointName = EndpointName.of(project, location, endpointId);

          byte[] contents = Base64.encodeBase64(Files.readAllBytes(Paths.get(fileName)));
          String content = new String(contents, StandardCharsets.UTF_8);
         
         
          String mess = " ";

        ImageClassificationPredictionInstance predictionInstance = ImageClassificationPredictionInstance.newBuilder().setContent(content).build();

    List<Value> instances = new ArrayList<>();
    instances.add(ValueConverter.toValue(predictionInstance));

  ImageClassificationPredictionParams predictionParams = ImageClassificationPredictionParams.newBuilder().setConfidenceThreshold((float) 0.5).setMaxPredictions(5).build();

    PredictResponse predictResponse = predictionServiceClient.predict(endpointName, instances, ValueConverter.toValue(predictionParams));
 
    System.out.println("Predictions");
    for (Value prediction : predictResponse.getPredictionsList()) {

      ClassificationPredictionResult.Builder resultBuilder = ClassificationPredictionResult.newBuilder();
      

      ClassificationPredictionResult result = (ClassificationPredictionResult) ValueConverter.fromValue(resultBuilder, prediction);

    
        mess = "\nRisultato: " + result.getDisplayNames(0)+" al "+100*result.getConfidences(0)+"%";
     
    }
    return mess;

  }
}
}