package com.company.autowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    // writing this before the dependency itself...it will inject automatically...no need to write setter method or constructor
    // same concept...first it will inject byType and if that fails it will try byName
    @Autowired
    @Qualifier("humanHeart") // If match found for humanHeart in beans.xml then directly create "humanHeart" object and inject that to the dependency called heart
    private Heart heart;

 /*   // If we are using constructor with arguments, Java JVM will not construct default constructor on its own
    // we will need to create default constructor
    public Human() {
    }

    // @Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }

    // Autowiring is not possible for primitive type or String type. It is only possible for object type

    @Autowired // first it tries to resolve with byType; if that fails it tries to resolve with byName
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
*/

    public void startpumping(){
        if(heart!=null) {
            heart.pump();
            System.out.println("name of animal is "+heart.getNameOfAnimal() +" and no. of heart is "+heart.getNoOfHeart());
        }
        else
            System.out.println("You are dead");
    }
}
