package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController{

    @GetMapping
    public String helloWorld(){
        return "Hello World. probando CI/CD automaticos. Ahora debe publicar de manera automatica";
    }
}