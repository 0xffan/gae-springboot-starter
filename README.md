# Hello Google App Engine for Spring Boot

[![CircleCI](https://circleci.com/gh/ixfan/gae-springboot-starter.svg?style=svg)](https://circleci.com/gh/ixfan/gae-springboot-starter)

This sample shows you how to deploy a simple "Hello World" [Spring Boot](http://projects.spring.io/spring-boot/) application to
[Google App Engine](https://cloud.google.com/appengine/docs/java/).

## Before you begin

1.  Download and install the [Google Cloud
    SDK](https://cloud.google.com/sdk/docs/).
2.  [Install and configure Gradle](https://gradle.org/).
3.  [Create a new Google Cloud Platform project, or use an existing one](https://console.cloud.google.com/project).
4.  Initialize the Cloud SDK.

            gcloud init

5.  Install the Cloud SDK `app-engine-java` component.

            gcloud components install app-engine-java

## Deploying to App Engine

To run the application locally, use the [Gradle App Engine
plugin](https://cloud.google.com/appengine/docs/standard/java/tools/gradle).

    ./gradlew bootRun

View the app at [localhost:8080](http://localhost:8080).

To deploy the app to App Engine, run

```shell
./gradlew appengineStage # build staged gae app
cd ./build/staged-app/
gcloud app deploy # deploy staged app
```

After the deploy finishes, you can view your application at
`https://YOUR_PROJECT.appspot.com`, where `YOUR_PROJECT` is your Google Cloud
project ID. You can see the new version deployed on the [App Engine section of
the Google Cloud Console](https://console.cloud.google.com/appengine/versions).

## License

* See [LICENSE](LICENSE)

