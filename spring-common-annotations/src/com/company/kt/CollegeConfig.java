package com.company.kt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


// If we are not maintaining beans.xml then we need to configure beans in Java Class which can be done by using @Configuration annotation
// So this is our configuration cl ass for College class

@Configuration
@ComponentScan(basePackages = "com.company.kt")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
/*
    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }

    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean
    public College collegeBean() // collegeBean -> beanID // method name will be beanID
    {
     // College college = new College(principalBean());  // for constructor injection
        College college = new College();
        college.setPrincipal(principalBean());  // for setter injection
        college.setTeacher(mathTeacherBean());  // for setter injection
        return college;
    }
    */
}
