package com.example.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lalito")
public class PruebaController{

    @RequestMapping(method=RequestMethod.GET)
    public String valid() throws Exception{
        return "Hola Lalito, soy una appa de back-end que solo responde este mensaje pedorro";
    }
}