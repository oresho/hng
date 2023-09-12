# HNG Stage 2 Task by Incognegro
This is the source code pertaining to my submission of the stage 2 task for the backend track for the HNG internship. This Spring boot API can perform CRUD operations on dynamic input.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Deployment](#deployment)
- [Usage & Testing](#usage--testing)
  - [Endpoints](#endpoints)


## Prerequisites

- Java 17 or higher
- Spring boot 3
- AWS account
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

## Deployment
 This application was deployed as an AWS ec2 instance. Use this tutorial https://www.youtube.com/watch?v=_vOInY6SRVE
    
## Usage & Testing
A Postman Document was included to show the various permissible requests. (https://github.com/oresho/hng/blob/stage2/HNG%20stage%202.postman_collection.json)
Please note that the "name" field is validated and will only accept letters as input.

### Endpoints
```bash
1. CREATE Endpoint (http://54.226.149.236:8080/api/1)
Create new Person
    Request:
      HTTP Method: POST
      Endpoint: /api
      Request Body:
       {
        "name": "John Doe"
      }
    Response:
      HTTP Status Code: 201 Created
      Response Body:
       {
        "id": 1,
        "name": "John Doe"
      }
   
2. READ Endpoint (http://54.226.149.236:8080/api/{id})
Get Person details by ID
    Request:
      HTTP Method: GET
      Endpoint: /api/{id}
    Response:
      HTTP Status Code: 200 OK
      Response Body:
       {
        "id": 1,
        "name": "John Doe"
      }

3. UPDATE Endpoint (http://54.226.149.236:8080/api/{id})
Update Person details by ID
    Request:
      HTTP Method: PUT
      Endpoint: /api/{id}
      Request Body:
       {
        "name": "Updated Name"
       }
    Response:
      HTTP Status Code: 200 OK
      Response Body:
       {
        "id": 1,
        "name": "Updated Name"
      }
   
4. DELETE Endpoint (http://54.226.149.236:8080/api/{id})
Delete a Person by ID
  Request:
    HTTP Method: DELETE
    Endpoint: /api/{id}
  Response:
  HTTP Status Code: 204 No Content




