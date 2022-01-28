# DifferentIAtor

This is a Java-Maven web app, built with the Vaadin framework. The main focus in this app is the A.I. that identifies the material of the photo the user uploads.
For creating the A.I. we used GCP (Google Cloud Platform) that made the creation and deployment of the A.I. model really easy and fast.
We even used GCP to deploy our app. So it's necessary to have a GCP account to re-build this app on your machine. 
Instead the app will work just fine till 5th of February. 

## Running the application

The project is a standard Maven project. To run it from the command line,
type `mvnw` (Windows), or `./mvnw` (Mac & Linux), then open
http://localhost:8080 in your browser.

You can also import the project to your IDE of choice as you would with any
Maven project. Read more on [how to import Vaadin projects to different 
IDEs](https://vaadin.com/docs/latest/flow/guide/step-by-step/importing) (Eclipse, IntelliJ IDEA, NetBeans, and VS Code).

## Deploying to Production

To create a production build, call `mvnw clean package -Pproduction` (Windows),
or `./mvnw clean package -Pproduction` (Mac & Linux).
This will build a JAR file with all the dependencies and front-end resources,
ready to be deployed. The file can be found in the `target` folder after the build completes.

Once the JAR file is built, you can run it using
`java -jar target/differentiator-1.0-SNAPSHOT.jar`

## Project structure

- `MainLayout.java` in `src/main/java` contains the navigation setup (i.e., the
  side/top bar and the main menu). This setup uses
  [App Layout](https://vaadin.com/components/vaadin-app-layout).
- `views` package in `src/main/java` contains the server-side Java views of your application.
- `views` folder in `frontend/` contains the client-side JavaScript views of your application.
- `themes` folder in `frontend/` contains the custom CSS styles.

## Useful links
For Vaadin:
- Read the documentation at [vaadin.com/docs](https://vaadin.com/docs).
- Follow the tutorials at [vaadin.com/tutorials](https://vaadin.com/tutorials).
- Watch training videos and get certified at [vaadin.com/learn/training](https://vaadin.com/learn/training).
- Create new projects at [start.vaadin.com](https://start.vaadin.com/).
- Search UI components and their usage examples at [vaadin.com/components](https://vaadin.com/components).
- View use case applications that demonstrate Vaadin capabilities at [vaadin.com/examples-and-demos](https://vaadin.com/examples-and-demos).
- Discover Vaadin's set of CSS utility classes that enable building any UI without custom CSS in the [docs](https://vaadin.com/docs/latest/ds/foundation/utility-classes). 
- Find a collection of solutions to common use cases in [Vaadin Cookbook](https://cookbook.vaadin.com/).
- Find Add-ons at [vaadin.com/directory](https://vaadin.com/directory).
- Ask questions on [Stack Overflow](https://stackoverflow.com/questions/tagged/vaadin) or join our [Discord channel](https://discord.gg/MYFq5RTbBn).
- Report issues, create pull requests in [GitHub](https://github.com/vaadin/platform).

For GCP:
-Read all the docs at [cloud.google.com/docs](https://cloud.google.com/docs).
-Read the documentation on Vertex IA and AutoML at [cloud.google.com/vertex-ai](https://cloud.google.com/vertex-ai/?utm_source=google&utm_medium=cpc&utm_campaign=emea-it-all-en-dr-bkws-all-all-trial-e-gcp-1011340&utm_content=text-ad-none-any-DEV_c-CRE_574628515915-ADGP_Hybrid%20%7C%20BKWS%20-%20EXA%20%7C%20Txt%20~%20%20AI%20%26%20ML%20~%20Vertex%20AI-KWID_43700066526085594-aud-606988877734%3Akwd-1428144711495-userloc_1008080&utm_term=KW_gcp%20vertex%20ai-NET_g-PLAC_&gclid=Cj0KCQiAxc6PBhCEARIsAH8Hff2P7wCR5CJJOri3EgNAHRDBKCJttoiv0B7tvm6a7eWu9ZWlNQeb-g0aAhCAEALw_wcB&gclsrc=aw.ds)
