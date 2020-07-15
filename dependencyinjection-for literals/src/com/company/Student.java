package com.company;

public class Student {

    private int id;
    private String studentname;

    public Student(int id) {
        this.id = id;
    }

    // for constructor injection
    public Student(int id, String studentname) {
        this.id = id;
        this.studentname = studentname;
    }

  /*  for setter injection
    public void setId(int id) {
        this.id = id;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }*/

    public void display(){

        System.out.println("Student id is "+id+" and Student name is "+studentname+" ");
    }
}
