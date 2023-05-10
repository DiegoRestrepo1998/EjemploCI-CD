package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://env-tomcat.eba-t5k3c7ej.us-east-2.elasticbeanstalk.com")
@RequestMapping("/prueba")
public class PruebaController{

    @GetMapping
    public String helloWorld(){
        return "Hello World. Realizando prueba final 09052023 7:13 pm";
    }
}
