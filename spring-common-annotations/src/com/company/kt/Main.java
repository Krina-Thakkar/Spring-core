package com.company.kt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College col = context.getBean("college",College.class);
        System.out.println(col);
        col.test();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
