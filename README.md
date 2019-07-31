# Spring Boot Workshop

### Contributors

ThoughtWorks University Batch 65, Peggy Init  
ThoughtWorks University Batch 66, Terracoders


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


### Tasking List Template for Practicing
Task [Number]: [Task Description]   
Estimation: [Number] minutes  
Actual Time: [Number] minutes  
Learnings:


### Steps
1. Init project
    * ./gradlew clean build - fail
    * Disable JPA in gradle.build
    * Explain why build failed - no configuration in application.properties for JPA
    * Comment JPA in build.gradle
    * git init & commit
2. Add README.md file
    * Add readme file, introduce basic format
    * Introduce gitignore file
    * Update README
3. Introduce problem: 
    * Product {id, name}
    * GET /products
    * Introduce RESTful API for Product
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