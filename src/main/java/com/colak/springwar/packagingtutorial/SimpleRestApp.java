package com.colak.springwar.packagingtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleRestApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleRestApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleRestApp.class, args);
    }

    // http://localhost:8080/sample/hello
    @GetMapping(path = "hello")
    public String hello() {
        return "<center>Hello World</center>";
    }
}
