package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student kri = context.getBean("student",Student.class);
        kri.display();

        Student s = context.getBean("student2",Student.class);
        s.display();

    }
}
