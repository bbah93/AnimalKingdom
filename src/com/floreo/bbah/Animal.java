package com.floreo.bbah;

import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;

import java.util.Random;

public abstract class Animal {

    int size;
    boolean isNocturnal;
    boolean hasFins;

    public boolean canSwim(boolean isDrowning){
        if(isDrowning){
            System.out.println("This species will drown :( ");
        } else {
            System.out.println("This species can swim!");
        }
        return  isDrowning;
    }

    public int swimSpeed(Animal animal){
        int swimSpeed;
        if(animal.hasFins){
            swimSpeed = 50;
        } else{
            Random rand = new Random();
            swimSpeed = rand.nextInt(20);
        }
        return swimSpeed;
    }


    public int getSize() {
        return size;
    }

    public boolean isNocturnal() {
        return isNocturnal;
    }


}
