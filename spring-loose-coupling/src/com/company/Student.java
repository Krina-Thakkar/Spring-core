package com.company;

public class Student {
    // student class need to support for any kind of cheats...we cannot change student class everytime
    // hence we are doing loose coupling. We are not using implementation class reference here; we are using interface
    private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        cheat.cheat();
    }

}
