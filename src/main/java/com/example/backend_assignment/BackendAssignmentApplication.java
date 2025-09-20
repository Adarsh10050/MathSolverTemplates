package com.example.backend_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.backend_assignment")
public class BackendAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendAssignmentApplication.class, args);
    }
}
