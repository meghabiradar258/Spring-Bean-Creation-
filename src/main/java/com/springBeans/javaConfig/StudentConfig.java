package com.springBeans.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Student helloWorld() {
        Student stud = new Student();
        stud.setMessage("Hello from Java Configuration!");
        return stud;
    }


}
