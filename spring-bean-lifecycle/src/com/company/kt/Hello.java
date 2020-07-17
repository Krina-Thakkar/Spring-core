package com.company.kt;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {
/*
public class Hello implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside after property set method --> init");
    }

    public void sample(){
        System.out.println("My code starts here and ends here");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method --> destroy");
    }
    */

    public void createConnection(){
        System.out.println("Inside hello class started!!");
    }

    public void closeConnection(){
        System.out.println("Destroying Hello class!!!");
    }

}
