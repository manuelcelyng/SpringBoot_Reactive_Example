# Reactive Programing
## Objetive
- This small project aims to understand how Reactive Programming works by implementing a Rest API that returns students from a Database using Delay on each returned data, this allows us to see how the reactive flow works.
## libraries implemented in this project:
  - **PostgreSQL Driver**: a JDBC and R2DBC driver that allows Java Programs to connect to a PostgreSQL database using standart, database independent Java code.
  - **Spring Reactive Web**: Build reactive web applications with Spring WebFlux and Netty
  - **Spring Data R2DBC**: Provides Reacctive Relational Database Connectivity to persist data in SQL stores using Spring Data in reactive applications.
  - **Lombok**: Java annotation library wich helps to reduce boilerplate code.
  - **flyway**: Version control for your database so you can migrate from any version (incl. an empty database) to the latest version of the schema.


## Notes:
- Spring Data R2DBC DONT have @Entity
- Usamos **flyway** la creación de la base de datos dado que r2DBC No la crea autimaticamente como lo hace Hibernate-JPA
