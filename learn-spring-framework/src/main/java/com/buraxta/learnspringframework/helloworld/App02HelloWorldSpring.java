package com.buraxta.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // 1. Launch a spring context

        try(var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

//        System.out.println(context.getBean("person"));
    }
}
