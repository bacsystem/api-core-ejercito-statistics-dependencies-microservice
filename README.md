# api-core-ejercito-statistics-dependencies-microservice

Microservicio que implementa la **lógica de negocio** para la consulta y gestión de **unidades**, **brigadas** y *
*divisiones** del Ejército del Perú.  
Forma parte del ecosistema **Core Ejército** y se integra con otros microservicios para proveer datos jerárquicos y
estadísticos a los sistemas de mando y control.

## 📋 Características

- Consultas optimizadas de unidades, brigadas y divisiones.
- Integración con la capa de persistencia (`lib-core-ejercito-statistics-repository`).
- Arquitectura limpia (**Clean Architecture**) y principios **DDD**.
- Soporte para filtros dinámicos y paginación.
- Respuestas en formato JSON.

## 🛠 Requisitos

- **Java**: 11+
- **Spring Boot**: 2.x o superior
- **Maven**: 3.9.4
- Base de datos soportada: Oracle (por defecto)
- Dependencias clave:
    - `spring-boot-starter-webflux` o `spring-boot-starter-web`
    - `spring-boot-starter-data-jpa`
    - `lib-core-ejercito-statistics-repository`

## 📦 Instalación y Ejecución

```bash
mvn clean install
```