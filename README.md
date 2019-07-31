# Spring Boot Workshop V0.2

### Contributors so far

ThoughtWorks University Batch 65, PeggyInit   

ThoughtWorks University Batch 66, TerraCoders

### Running the application

Configure the `application.properties` file with the local PostgreSQL database info.

Make sure in the database given, there are no tables `flyway_schema_history` & `product`.

`./gradlew clean build` to check if all the tests pass.

`./gradlew bootRun` to run the application.

Visit the following url `GET http://localhost:8080/products`

### Tasking List

Use the tasking list template below and follow the steps below to make your own tasking list.

You could 'git check out' the commit of each step to see what to do as reference.

### Tasking List Template for Practicing

Task [Number]: [Task Description]   
Estimation: [Number] minutes  
Actual Time: [Number] minutes  
Learnings:


### Spring Initializr
**Website**: https://start.spring.io/  
**Project**: Gradle Project  
**Language**: Java  
**Spring** Boot: 2.1.6  
**Group**: com.thoughtworks  
**Artifact**: spring-boot-workshop (decide by yourself)  
**JAVA**: 8 (decide by yourself)  
**Dependencies**:  
Spring Web Starter  
Spring Boot DevTools  
Spring Data JPA  
PostgreSQL Driver  
Flyway Migration


### Steps
1. Init project
    * ./gradlew clean build - fail
    * Explain why build failed - no configuration in application.properties for JPA
    * Comment JPA in build.gradle
    * ./gradlew clean build - succeed
    * git init & commit
2. Add README.md file
    * Add README file
    * Explain the markdown basic syntax
    * Explain the usage of gitignore file
    * Update README
3. Introduce the problem: 
    * Product {String id, String name}
    * GET /products
    * Explain RESTful API for Product (CRUD)
4. should return ok when getting products - Controller
    * ProductController Unit Test
    * Explain @WebMvcTest and MockMvc
    * Explain Difference between @RestController and @Controller
    * Explain ResponseEntity
    * Update README
5. Introduce tools such as postman, insomnia
    * ./gradlew bootRun - start the application
    * Send POST /products to get 405, GET /products to get 200
6. should return empty list when getting products - Controller
    * Explain jsonPath
    * Explain ResponseEntity.body()
    * Update README
7. Add service layer in controller to return the empty list
    * Explain @MockBean working with @WebMvcTest
    * Explain Mockito when() and thenReturn()
    * Explain Mockito verify() and times()
    * Explain field injection is not recommended
    * Explain @Service
8. should return list with one product when getting products - Controller
    * Explain the importance of getter in Product for serialization and deserialization
    * Explain advanced usage of jsonPath expression
    * Update README
9. should return null when get all - Service
    * ProductService Unit Test
    * Explain hamcrest assertThat(), is() and nullValue()
    * Update README
10. Add repository layer in service to return null
    * Explain without @WebMvcTest, we should use @Mock instead of @MockBean
    * Update README
11. should return list with one product when getting all - Service
    * Update README
12. Introduce JPA and connect JPA to database
    * Uncomment JPA in build.gradle
    * Add configuration in application.properties file
    * ./gradlew clean build - check configuration of JPA connection to DB
    * Update README
13. Refactor Repository with JPA and introduce Flyway
    * ProductRepository from class to interface
    * Explain JpaRepository<T, ID>
    * Explain JPA methods naming convention
    * Explain @Entity and @Id
    * Explain Flyway as migration tool
    * Add Flyway script
    * Explain Flyway script naming convention
    * Update README
14. Run the application and test with Chrome and Postman
    * ./gradlew bootRun
    * GET http://localhost:8080/products
    * Introduce Chrome plugin JSON Viewer

### Questions & Feedbacks

For any questions and feedbacks, please come to Hao at any time.

Email: hpan@thoughtworks.com

### Trainer Challenge (TODO)

Advanced technologies that could be used around `GET /products API` based on the existing codebase.

You will need to try to figure them out by yourself.