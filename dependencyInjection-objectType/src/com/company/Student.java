package com.company;

public class Student {

    private int id;
    private MathCheat mc;

    public void setId(int id) {
        this.id = id;
    }

    public void setMc(MathCheat mc) {
        this.mc = mc;
    }

    public void cheating(){
        mc.mathCheat();
        System.out.println("My id is "+id);
    }
}
