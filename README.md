## Glee Core API Service

### Setup

#### Change mysql username and password as per your installation**

```bash
$ open src/main/resources/application.yml
$ change spring.datasource.username and spring.datasource.password as per your mysql installation
```

```bash
# Runs on http://localhost:8080
$ mvn clean spring-boot:run
```

#### API

- GET `/api/articles`
- POST `/api/articles`
- GET `/api/articles/{id}`
- PUT `/api/articles/{id}`
- DELETE `/api/articles/{id}`
