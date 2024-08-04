package com.javatechie.google.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringSsoGoogleApplication {

    @GetMapping("/get")
    public String welcome() {
        return "Welcome to Google !!";
    }

    

    public static void main(String[] args) {
        SpringApplication.run(SpringSsoGoogleApplication.class, args);
    }

}
