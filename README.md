# gwtquarkus

### How to run 

- Build the project `mvn clean verify`

- Super Development mode :

1. Open a terminal in the `gwtquarkus-backend` folder and run the following command :
`mvn compile quarkus:dev` 

2. Open a terminal in the project root folder and run the following command :
`mvn gwt:codeserver -pl *-frontend -am`

- For production, follow the instructions in the backend module readme file.
