# HNG Stage 2 Task by Incognegro
This is the source code pertaining to my submission of the stage 2 task for the backend track for the HNG internship. This Spring boot API can perform CRUD operations on dynamic input.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
  - [Endpoints](#endpoints)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

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
 
## Usage
A Postman Document was included to show the various permissible requests.

### Endpoints

`GET /api/{id}: Retrieve details of a person by ID. [] TODO: add sample request
`POST /api: Create a new person. []
`PUT /api/{id}: Update details of an existing person. []
`DELETE /api/{id}: Remove a person.[]

