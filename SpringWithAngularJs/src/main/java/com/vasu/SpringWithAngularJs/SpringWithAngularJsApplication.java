package com.vasu.SpringWithAngularJs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringWithAngularJsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringWithAngularJsApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        SpringApplication.run(SpringWithAngularJsApplication.class, args);
    }
}
