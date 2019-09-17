package com.thmarket;

import com.thmarket.rpc.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class DemoSpringbootRpcHessianClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootRpcHessianClientApplication.class, args);
    }

    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8083/HelloWorldService");
        factory.setServiceInterface(HelloWorldService.class);
        return factory;
    }
}
