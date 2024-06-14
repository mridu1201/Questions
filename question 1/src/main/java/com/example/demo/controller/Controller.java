package com.example.demo.controller;

import com.example.demo.service.Service;

@RestController
@Requestmapping("http://20.244.56.144/test")
public class Controller {
    private Service service;
    
    @GetMapping("/{type}")
    public average numbers(@PathVariable String type)
    {
        return service.average(type);
    }
}
