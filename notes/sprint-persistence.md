# Persistence in Spring

Possible options.

1. JdbcTemplate
2. Spring Data - JPA

## 1. JdbcTemplate class

- Need `spring-boot-starter-jdbc`along with database dependency
- Define repository interface. ( query or save )
- Implement repository interface in a class. Annotate with `@Repository`
- Methods
  1. `jdbc.query()` : Select multiple records
  2. `jdbc.queryForObject()` : Select one element
  3. `jdbc.udpate()`: Insert or update
  4. RowMapper function is required to map ResultSet to Model object.
- Schema and data
  - If `schema.sql` is present in classpath, it will be used at start
  - Same for loading data : `data.sql`

## 2. Spring Data - JPA

### Introduction

- Spring Data is a big umbrella under which many projects related to data persistence exist.
  - JPA, Mongo, Redis etc
- Most important feature : Automatica creation of repositories based on interface.
- springboot-starter-data-jpa
  - Default implementation is Hibernate.

### Annotating the domain as entities

- `@Entity` , and `@Id` to define unqiue column.
- JPA entities must have no args constructor.
-
