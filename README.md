# DONE: Add relevant documentation like curls of the services
# DONE: application.yml variable documentation

# app-vehicle-purchase-api

Application for purchasing vehicles.

## Tabla de Contenidos

* [Desarrollo](#desarrollo)
* [Integraciones](#integraciones)
  * [Base de Datos](#base-de-datos)
* [Trazabilidad](#trazabilidad)
* [Procesos](#procesos)
  * [Proceso 1](#p1)
  * [Proceso 2](#p2)
  * [Proceso 3](#p3)
* [Operacion](#operacion)
* [Troubleshooting](#troubleshooting)


## Integraciones


## Base de Datos

| Url Dev       | Url Prod      | 
| ------------- |:-------------:| 
| jdbc:mysql: | jdbc:mysql: |  

	


## Procesos
Procesos del api.

| Nombre        | Descripcion   | Curl                                                       |
| ------------- |:-------------:| :--------------------------------------------------------- |
| Get Vehicles  | Get Vehicles  | `curl -X GET http://localhost:8080/vehicle`                |
| Post Vehicles | Post Vehicles | `curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/vehicle` |
| Get Customer  | Get Customer  | `curl -X GET http://localhost:8080/customer`               |
| Post Customer | Post Customer | `curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/customer`|
| Get Order     | Get Order     | `curl -X GET http://localhost:8080/order`                  |
| Post Order    | Post Order    | `curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/order`   |

### application.yml Variables

*   **spring.application.name**: The name of the application.
*   **spring.application.version**: The version of the application.


### Create the database
CREATE DATABASE "app-vehicle-purchase-api";

### Create the user
CREATE USER "app-vehicle-purchase-api" WITH PASSWORD '123456789!aA';

### Grant privileges to the user on the database
GRANT ALL PRIVILEGES ON DATABASE "app-vehicle-purchase-api" TO "app-vehicle-purchase-api";