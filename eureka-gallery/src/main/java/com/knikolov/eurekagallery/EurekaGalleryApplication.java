package com.knikolov.eurekagallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGalleryApplication.class, args);
    }

}
