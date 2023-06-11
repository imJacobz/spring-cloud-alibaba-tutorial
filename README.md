# NX-AUTO-ALI

a simple example using spring cloud alibaba 

## Project Structure

app-gateway: gateway service

app-model: core entities, models and repositories

ms-*: micro services

## How To Run

1. download Nacos Server from https://nacos.io, unzip and run a standalone instance with following command:  

Linux and macOS: 
```bash
$NACOS_HOME/bin/startup.sh -m standalone 
```
Windows:
```bash
%NACOS_HOME%/bin/startup.cmd -m standalone 
```

2. build app-model
3. run ms-customer and ms-shop, port 8081 and 8082
4. run app-gateway, port 8080
5. access [http://localhost:8848/nacos/index.html#/serviceManagement](http://localhost:8848/nacos/index.html#/serviceManagement) to check services are registered in nacos
6. http://localhost:8080/api/v1/customer/1, customer service.
7. http://localhost:8080/api/v1/shop/customer/1, shop service.
