# Compte rendu : 
### Implementing Spring Cloud microservices with Consul Discovery, Spring Cloud Config, and Spring Cloud Gateway, complemented by an Angular front-end.

The purpose of this project is to build an application using Spring Cloud microservices. We'll leverage Consul Discovery, Spring Cloud Config, and Spring Cloud Gateway to enhance the functionality. To make it user-friendly, we'll also implement an Angular front-end.



## 1. DISCOVERY SERVICE:

For the discovery service, we have the option to use either Consul or Eureka service to store information about microservices. In this project, we opted for Consul service.
   
### Consul services:

![cap1](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/a98189ee-f164-4d87-803f-c13f0b231112)

## CONFIG-SERVICE

There are two ways to handle configuration. We can either utilize the config service, storing configurations for all microservices in a file called application.properties, or we can employ the discovery service.

1- Configuration with Config-service: 

![config-service](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/e502f094-fd9e-49ba-a3fd-347c15d75abe)

## GATEWAY-SERVICE
