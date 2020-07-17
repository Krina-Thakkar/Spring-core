package com.company.kt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JDBCConnection jdbcconnect = context.getBean("jdbc",JDBCConnection.class);
        jdbcconnect.display();
        jdbcconnect.getJDBCConnection();
    }
}
