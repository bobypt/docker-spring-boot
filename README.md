# Docker Spring boot
Simple demo spring boot app. Please read more information [here](https://boby.com.au/technical/2018/08/20/Containerize-and-deploy-spring-boot-api.html).

## Build image

```./gradlew build docker ```

## Run the app
```docker run -p 8080:8080 -t org.bpt/demo```

## Test the app
Test endpoint - ```curl localhost:8080/greet ```

Health end point - ```curl localhost:8080/actuator/health ```

