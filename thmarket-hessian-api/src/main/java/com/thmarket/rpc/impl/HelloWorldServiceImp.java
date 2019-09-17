package com.thmarket.rpc.impl;

import com.thmarket.rpc.HelloWorldService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("HelloWorldService")
public class HelloWorldServiceImp implements HelloWorldService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
