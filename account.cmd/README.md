# Bank Customer Service
This service acts as the repository for customer information. It depends on the eureka service.

## Dependencies
* Mongo DB
  ** Windows Installation https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/
  ** macOS Installation https://docs.mongodb.com/master/tutorial/install-mongodb-on-os-x/?_ga=2.28850044.1532230145.1501348086-1281814077.1501348086
* Java 8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

## Run from terminal
* Unix
```bash
./gradlew bootRun
```
* Windows
```bash
./gradlew.bat bootRun
```

## Run from Intellij
* Import the project folder
* View -> Tool Windows -> gradlew
* In the Gradle pane double click bootRun

## Compile Jar
* Double click 'jar' from the Gradle pane

## Build Docker Image
* Compile the jar
* Excute the following
```bash
docker build -t account-server .
```

## Run Docker Image
```bash
docker run -d -p 8084:8084 account-server
