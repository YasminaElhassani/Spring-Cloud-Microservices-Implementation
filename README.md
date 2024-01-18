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

2- Configuration with consul service:

![config with consul](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/3f9c5416-dbd0-4874-9c2b-67109c14ccda)

## GATEWAY-SERVICE

We can access the services through the gateway.

![gitway](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/c781e148-b33c-435b-8278-8926155f386b)

# CUSTOMER-SERVICE:

![cutomer](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/98eca5e0-414d-46b8-8b35-f1426dc19da7)

# INVENTORY-SERVICE:

![inventory-test-](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/e0e67b97-ce15-486c-9ca6-daa16e5d111c)

# ORDER-SERVICE:

![order](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/106d4acf-d907-4187-8ada-3ece625ab511)

# BILLIG-SERVICE:

We configured the billing service using the second method of configuration, which involves utilizing the Consul service. Additionally, we set up the sharing of secrets using Vault

1- Configuration using consul:

![config with consul](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/3f9c5416-dbd0-4874-9c2b-67109c14ccda)

2- Sharing of secrets using Vault :

![secret](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/2635e84a-634a-4681-8662-e1e4225ee3d4)

# FRONT-END USING ALGULAR:

![front1](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/34ec5028-2482-4701-b135-7a8cedd76928)

![front2](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/dcdabf50-3244-4109-bd2d-c8552e99f454)

![front3](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/e2b90a35-7459-4141-8d95-dea20dfe2da1)

![front4](https://github.com/YasminaElhassani/Spring-Cloud-Microservices_With-Angular/assets/103280152/79aea185-819e-488e-8e21-a80a75a3ef32)

