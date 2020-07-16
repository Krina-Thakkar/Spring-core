package com.company.kt;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    // whenever we are putting @Value annotation over our dependency then our setter methods won't be called
    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

/*
    public void setName(String name) {
        this.name = name;
        System.out.println("setter method called for setName");
    }

    // To create student class object it is mandatory to give Value for interestedCourse as we are using Required annotation here
    @Required
    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
        System.out.println("setter method called for setInterestedCourse");
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

 */

    public void display(){
        System.out.println("Student name is "+name);
        System.out.println("Student's interested course is "+interestedCourse);
        System.out.println("Student's hobby is "+hobby);
    }
}
