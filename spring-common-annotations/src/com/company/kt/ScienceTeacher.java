package com.company.kt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// It will create ScienceTeacher object
@Component
public class ScienceTeacher implements Teacher {

    @Override
    public void teach(){
        System.out.println("Hi I am your Science teacher");
    }
}
