package com.springBeans.Anotation;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String message = "Hello from Annotation Configuration!";

    public void getMessage() {
        System.out.println("Message: " + message);
    }
}

