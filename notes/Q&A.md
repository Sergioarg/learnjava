<!-- Mejorar notas vistas en MD -->

## Questions.

1. Que es un @Bean
> - The object that form the backbone of yout app and that are managed by the Spring *IoC* container called are called beans.
> - Un bean es un objeto que es instanciado, ensamblado y administrado por un contenedor Spring IoC.

2. Como funciona el ciclo de vida de un @Bean
> The container creates the instance of a bean as per the request, and then dependencies are injected. And finally, the bean is destroyed when the spring container is closed.
3. Que es y como funciona el Singletone y Singletone Scope
> #### Singleton pattern:
> - Restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine
> - Is used for logging, drivers objects, caching, and thread pool
> #### Singletone Scope:
> - Singleton scope in Spring means that this bean will be instantiated only once by Spring

4. Que es AOP: Aspect-Oriented Programing
> Paradigma de programación que permite una adecuada modularización de las aplicaciones y posibilita una mejor separación de responsabilidades.

5. Definición de Hibernate y JPA: Java Persistence API
> Hinernate is the ORM of Java and JPA is the way to make an API.

6. Estructura de datos DAO: Data Access Object
> Patrón estructural que nos permite aislar la capa de aplicación/negocio de la capa de persistencia(JPA)

7. Datos primitivos y complejos
> *Datos primitivos:* Tipos de datos más básicos y simples del sistema de tipos de Java Ejemplo: int, char, boolean

> *Datos Complejos:* Todos los demás tipos de Java son objetos Ejem´plo: String, List, clases propia o de una libreria.

8. Contructor Injection y Setter Injection
> La Inyección de Dependencias es un aspecto fundamental del framework Spring, a través del cual el contenedor Spring "inyecta" objetos en otros objetos o "dependencias".

9. Que hace exactamente la anotación @Repository
> A repository includes all the methods such as sorting, paginating data and CRUD operations. For specifying that the underlying interface is a repository, a marker annotation @Repository is used.

10. Que es? [Service Facade Design Pattern](https://www.ibm.com/docs/pt-br/integration-bus/9.0.0?topic=SSMKHH_9.0.0/com.ibm.etools.mft.pattern.sen.doc/sen/sf/overview.html)
    - Diferentes formas para integrar varios DAO
12. @Service que es y como funciona?
13. Cual es la diferencia entre `implements` y `extends`.
> `implements`: significa que está utilizando los elementos de una interfaz Java en su clase..
> `extends`: significa que está creando una subclase de la clase base que está extendiendo
14. Bus Integration
> Conectividad significa que varias aplicaciones pueden interactuar e intercambiar datos con otras aplicaciones en una infraestructura flexible, dinámica y ampliable

---
### Notes
Date: 31/05/2023
- Spring and Jackson Support
    - When building Spring REST Apps
    - Spring will automatically handle Jackson Integration
    - *JSON* data being passed to REST controller is converted to *POJO*
    - Java object being returned from REST controller is converted to JSON
---
### Definitions¿
- *Inversion of Control (IoC)*: Software Desing Pinciple es un principio de asegura que un programa puede ser beneficioso en terminos de pluggability, testability, usability y bajo acoplamiento.
- CRM: Customer Ralational Manager App

## Conceptos

Layered Architecture.

Model View Controller (MVC):
    - Model: Define data structure
    - 

1. Service: Manage data and bussines data, bussines logic: logica de cada negocio
2. Respository: Tiene las consultas de las bases de datos
Clase en Modelo: clases User y atributos de la clase user.
