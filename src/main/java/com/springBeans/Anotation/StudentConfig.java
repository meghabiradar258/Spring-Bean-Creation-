package com.springBeans.Anotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "com.springBeans.Anotation;")
public class StudentConfig {

}
