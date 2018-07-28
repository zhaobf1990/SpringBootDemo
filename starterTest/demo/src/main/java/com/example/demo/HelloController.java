package com.example.demo;

import com.example.zhaobf.springbootstarterhello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
    HelloService helloService;


    //http://127.0.0.1:8080
    @RequestMapping(path = "/")
    public String hello() {
        return helloService.sayHello();
    }
}
