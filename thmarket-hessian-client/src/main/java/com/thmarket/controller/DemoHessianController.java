package com.thmarket.controller;

import com.thmarket.rpc.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHessianController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/rpchello.do") // http://localhost:8080/rpchello.do?name=123
    public Object rpcSayHello(String name) {
        return helloWorldService.sayHello(name);
    }
}