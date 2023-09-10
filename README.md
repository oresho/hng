# HNG Stage 2 Task by Incognegro
This is the source code pertaining to my submission of the stage 2 task for the backend track for the HNG internship. This Spring boot API can perform CRUD operations on dynamic input.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage & Testing](#usage-&-testing)
  - [Endpoints](#endpoints)
- [Deployment](#deployment)

## Prerequisites

- Java 17 or higher
- Spring boot 3
- Render
- PostgreSQL 15 database
- [Maven](https://maven.apache.org/) (for building and managing dependencies)

## Getting Started

First, get a copy of this repo on your local machine by using the git clone command.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/oresho/hng.git
   cd stage2

2. Build the project using Maven:
   ```bash
   mvn clean install

### Configuration
1. All required dependencies were already added to the pom.xml file. You can check :) -> Lombok, Spring Data JPA, PostgreSQL data JDBC driver, Spring Data Validation, and Spring Web.
2. The required database connection is also set up for you in the src/main/resources/application.properties file. You can set up your own database using:
    ```bash
    spring.datasource.initialize=true
    spring.datasource.url=jdbc:postgresql://your-db-host:your-db-port/your-db-name
    spring.datasource.username=your-db-username
    spring.datasource.password=your-db-password
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.properties.hibernate.format_sql=true
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    
    server.error.include-message=always

  3. You can also configure other application-specific settings in the same file.
 
## Usage & Testing
A Postman Document was included to show the various permissible requests.

### Endpoints
1. CREATE Endpoint
Create new Person
    Request:
      HTTP Method: POST
      Endpoint: /api
      Request Body:
       {
        "name": "John Doe",
        "age": 30
        "email": "oresho@yahoo.com"
      }
    Response:
      HTTP Status Code: 201 Created
      Response Body:
       {
        "id": 1,
        "name": "John Doe",
        "age": 30
        "email": "oresho@yahoo.com"
      }
   
2. READ Endpoint
Get Person details by ID
    Request:
      HTTP Method: GET
      Endpoint: /api/{id}
    Response:
      HTTP Status Code: 200 OK
      Response Body:
       {
        "id": 1,
        "name": "John Doe",
        "age": 30
        "email": "oresho@yahoo.com"
      }

3. UPDATE Endpoint
Update Person details by ID
    Request:
      HTTP Method: PUT
      Endpoint: /api/{id}
      Request Body:
       {
        "name": "Updated Name",
        "age": 35
        "email": "updatedemail@yahoo.com"
       }
    Response:
      HTTP Status Code: 200 OK
      Response Body:
       {
        "id": 1,
        "name": "Updated Name",
        "age": 35
        "email": "updatedemail@yahoo.com"
      }
   
5. DELETE Endpoint
Delete a Person by ID
  Request:
    HTTP Method: DELETE
    Endpoint: /api/{id}
  Response:
  HTTP Status Code: 204 No Content


## Deployment
 This application was deployed on render, follow these steps to deploy:
 1. Package your application in a jar file using
    ```bash
    mvn clean package
 2. Test the package by using the command:
    ```bash
    java -jar your-application.jar
 3. Add a docker file with the following commands:
    ```bash
      FROM eclipse-temurin:17-jdk-alpine
      VOLUME /tmp
      COPY target/*.jar app.jar
      ENTRYPOINT ["java","-jar","/app.jar"]
      EXPOSE 8080




