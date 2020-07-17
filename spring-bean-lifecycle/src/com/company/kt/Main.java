package com.company.kt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     //   ((ClassPathXmlApplicationContext)context).registerShutdownHook();
        StudentDAO dao = context.getBean("studentinfo",StudentDAO.class);
        dao.selectAllRows();
        Hello hello = context.getBean("hello",Hello.class);
     //   dao.deleteStudentRecord(5);

     //   ((ClassPathXmlApplicationContext)context).close();
        //registerShutdownHook() is same as close() method; the only difference is that it will be executed once everything is done in main()
        // so once all your code in main() gets executed it will be called and close your container
        // So it won't give us any exception irrespective of the line no. we are calling it
    }
}

// Bean lifecycle methods are also called callback methods as these methods are automatically called by the framework
// There are 3 ways to configure bean lifecycle
/*  1) Annotation Approach
    2) XML Approach
    3) By implementing interface (not recommended)
 */