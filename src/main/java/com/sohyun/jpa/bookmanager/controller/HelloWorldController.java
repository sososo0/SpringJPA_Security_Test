package com.sohyun.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestAPI 요청을 받을 수 있다는 의미
public class HelloWorldController {

    // Method : GET
    // Url path : /hello-world
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world";
    }

}
