package com.buraxta.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Burak";
    }

    @Bean
    public int age(){
        return 11;
    }

    @Bean
    public Person person(){
        return new Person("eymo",6);

    }
}
