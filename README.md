Example for a bug in springdoc-openapi when `GenericConversionService` is a CGLIB proxy.

To reproduce the bug:

1. Run `cd springdoc-openapi-spring-boot-2-webmvc && mvn spring-boot:run`
2. Open http://localhost:8080/swagger-ui/index.html