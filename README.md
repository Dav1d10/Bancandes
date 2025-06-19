# Bancandes

## Description

This web application project was developed as part of the **ISIS2034 Sistemas Transaccionales (Databases)** course at _Universidad de Los Andes_. Bancandes provides CRUD functionality and search capabilities for managing clients, account managers, bank accounts, office branches, service points, tellers, and financial transactions. Built for scalability and operational clarity, it is ideal for internal use by bank staff or administrators.

## Project Documentation 

- [UML Diagram](docs/UML_BancAndes)
- [Database Tables Creation Script](docs/CreacionTablas.sql)
- [Tables Data Insertion Script](docs/PoblacionTablas.sql)

## Tech Stack

- **Backend:** Java with Spring Boot
- **Frontend:**
  - **Bootstrap** – Used for styling and responsive layout with pre-built CSS components.
  - **Thymeleaf** – A server-side Java template engine used to dynamically render HTML content from the backend (Spring Boot).
- **Data Persistence:** Implemented using a SQL-based relational database hosted in SQLDeveloper.

 ## Repository Structure 

 The project is organized into one main folder:
 - `Bancandes/`
    - `bancandes`

## Prerequisites 

Before running the project locally, make sure you have the following installed:

-  **Java Development Kit (JDK)** — version 11 or higher

  Verify with:
  ```bash
  java -version
  ```
- **Apache Maven** — For building and managing dependencies
```bash
mvn -version
```
- Navigate to the resources directory into the `application.properties` file and assign the following variables 
```bash
cd bancandes/src/main/resources/application.properties

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```
- Create the following tables in your database with this [script](docs/CreacionTablas.sql).
- Insert data into the tables with this [script](docs/PoblacionTablas.sql) (optional).

## How to run

Follow these steps to run the application locally:
1. Clone the repository
  ```bash
  git clone https://github.com/Dav1d10/Bancandes.git
  ```
2. Open a terminal and navigate to the `main directory`:
 ```bash
  cd bancandes
  ```
3. Build and run the application via Maven:
  ```bash
  mvn clean spring-boot:run
  ```
4. Once running, open your browser and navigate to:
  ```bash
  http://localhost:8080
  ```
    
## Collaborators

- Alejandro Abril
- Gabriel Martinez
