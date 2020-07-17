package com.company.kt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// It will create MathTeacher object
@Component
@Primary  // if we have multiple class implementation then @Primary will be our default class implementation
public class MathTeacher implements Teacher {

    @Override
    public void teach(){
        System.out.println("Hi I am your MATH teacher");
    }
}
