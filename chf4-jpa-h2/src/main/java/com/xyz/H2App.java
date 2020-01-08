package com.xyz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class H2App {

    public static void main(String[] args) {
        SpringApplication.run(H2App.class, args);
    }


    // h2-console

    //http://localhost:8089/h2-console/login.do?jsessionid=edd7da617270f696faf393b563fc6c4d


    // http://localhost:8089/hello

}
