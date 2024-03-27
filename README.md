# NX-AUTO-ALI

An example using spring cloud alibaba

## Updates

1. Upgrade SpringCloud version to 2023.0.0
2. Add Spring Security to protect APIs.
3. Add Spring Session.
4. Integrated with MyBatis-Plus.
5. Use Nacos central configuration.
6. Seata global transaction support.
7. Sentinel flow control support.
8. Zipkin support.

## Project Structure

app-common: core entities, models, repositories/mappers, feign APIs  
app-security: spring security core config and filters
ms-gateway: gateway service  
ms-*: micro services

## How To Run

1. Set up a MySQL server and import the dev.sql file, set up a Redis server.
2. Download Nacos Server from <https://nacos.io>, unzip and run a standalone instance with following command:  

    Linux and macOS:

    ```bash
    $NACOS_HOME/bin/startup.sh -m standalone 
    ```

    Windows:

    ```bash
    %NACOS_HOME%/bin/startup.cmd -m standalone 
    ```

3. Access [http://localhost:8848/nacos/#/configurationManagement](http://localhost:8848/nacos/#/configurationManagement), create a YAML format configuration as following picture says.
    ![nacos config](res/nacos_config.png)
    Configuration example can be found in res directory.
4. Build app-common
5. Run ms-auth, ms-customer and ms-shop, at port 8090, 8081 and 8082
6. Run app-gateway, at port 8080
7. Access [http://localhost:8848/nacos/index.html#/serviceManagement](http://localhost:8848/nacos/index.html#/serviceManagement) to check if the services are registered in Nacos
8. Open a terminal window, access login API to get X-Auth-Token:

    ```bash
      curl --request POST 'http://localhost:8080/api/auth/login' \
          -d "username=jacob&password=000000"
    ```

   it will return a json response like this:

    ```json
   {
      "code": "200",
      "message": "Success",
      "data": {
        "userId": 1,
        "email": "jacob@example.com",
        "token": "75de3c9e-db56-4382-9c6e-df79a5a2570e",
        "username": "jacob"
      },
      "timestamp": 1711515239181
    }
    ```

9. Then access other APIs with X-Auth-Token in request header, for example:

    ```bash
    curl -X GET 'http://localhost:8080/api/customer/1'\
         -H 'X-Auth-Token:4be4d210-1f78-4b8e-b88d-bd1304a2246c'
    ```

    you will get correct response, like this:

    ```json
    {
        "code": "200",
        "message": "success on: 8081",
        "data": {
            "id": 1,
            "addTime": "Feb/17/2020 09:54:07",
            "updateTime": "Aug/28/2022 16:57:03",
            "status": 1,
            "customerName": "Jacob Zyrael",
            "address": "Somewhere",
            "city": "Austin"
        },
        "timestamp": 1711515379068
    }
    ```
