package com.example.kubedeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class KubedeployApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(KubedeployApplication.class, args);
    }
}