package com.example.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController{

    @RequestMapping(method=RequestMethod.GET)
    public String valid() throws Exception{
        return "OK";
    }
}