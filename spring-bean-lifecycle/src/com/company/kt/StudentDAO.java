package com.company.kt;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO {

    private String driver;
    private String url;
    private String username;
    private String password;
    private Connection conn;

    public void setDriver(String driver) {
        System.out.println("setting driver...");
        this.driver = driver;
    }

    public void setUrl(String url) {
        System.out.println("setting url...");
        this.url = url;
    }

    public void setUsername(String username) {
        System.out.println("setting username...");
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println("setting password...");
        this.password = password;
    }

  //  @PostConstruct // it works as a init method...it will be called automatically after object creation...no need to call this method manually
    public void createConnection() throws ClassNotFoundException, SQLException {
        System.out.println("creating Connection for student db...");
        // load driver
        Class.forName(driver);
        // get connection
        conn = DriverManager.getConnection(url,username,password);
    }

   // @PreDestroy // it will be called automatically before our bean is removed from the container
    public void closeConnection() throws SQLException {
        System.out.println("Destroy method is called...");
        conn.close();
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        System.out.println("Retrieving student data...");
        // Execute query
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from student.HostelStudentInfo;");

        while(rs.next()){
            int studentid = rs.getInt(1);
            String studentName = rs.getString(2);
            int fees = rs.getInt(3);
            String foodType = rs.getString(4);
            System.out.println(studentid+" "+studentName+" "+fees+" "+foodType);
        }

    }
    public void deleteStudentRecord(int studentid) throws ClassNotFoundException, SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE from student.HostelStudentInfo where Student_id = "+studentid);
        System.out.println("Record deleted with studentid "+studentid);
    }
}


// 1) object created inside container (container started -> bean initiated)
// 2) Dependency injected
// 3) your custom init method called
// 4) bean is ready to use
// 5) container shutdown (i.e. context.close())
//  (In web application, container is closed automatically; Here we need to close the container explicitly)
//  (For SE application i.e. desktop app we need to close connection while for EE application (Web app) we do not need to close the connection manually
// 6) your custom destroy method is called