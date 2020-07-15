package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

    public static void main(String[] args) {
       /* Student stud = new Student();
        MathCheat mc = new MathCheat();
        stud.setMc(mc);
        stud.cheating();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s = context.getBean("stud",Student.class);
        s.cheating();

        AnotherStudent anotherS = context.getBean("anotherStud",AnotherStudent.class);
        anotherS.startcheating();
    }
}
