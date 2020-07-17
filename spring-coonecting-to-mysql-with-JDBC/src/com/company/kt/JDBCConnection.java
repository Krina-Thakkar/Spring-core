package com.company.kt;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String pwd;
    @Value("${mysql.driver}")
    private String driver;

    public void display(){
        System.out.println(url+" "+username+" "+pwd+" "+driver);
    }

    public void getJDBCConnection() throws Exception{
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,username,pwd);
        System.out.println("Connection successful: "+conn);
    }
}
