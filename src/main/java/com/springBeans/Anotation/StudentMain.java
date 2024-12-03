package com.springBeans.Anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student obj = context.getBean(Student.class);
        obj.getMessage();
    }
}