package com.floreo.bbah.canine;


public class Dog implements Canine {

    int weight;
    boolean isDomesticated;

    public Dog(int weight, boolean isDomesticated){
        this.weight = weight;
        this.isDomesticated = isDomesticated;
    }

    @Override
    public boolean hasWinterCoat(int temp) {
        return false;
    }

    @Override
    public boolean isPeopleShy(boolean isFull) {
        return false;
    }

    public boolean isBarking(boolean isStranger){
        return isStranger;

    }

    public boolean isChasing(boolean isSquirrel){

        return isSquirrel;
    }
}
