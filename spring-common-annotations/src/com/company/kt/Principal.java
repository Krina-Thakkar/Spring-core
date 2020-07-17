package com.company.kt;

import org.springframework.stereotype.Component;

// It will create Principal object
@Component
public class Principal {
    public void principalInfo(){
        System.out.println("Hi I am your principal");
        System.out.println("my name is Mrs. Best");
    }
}
