package com.floreo.bbah.canine;


import com.floreo.bbah.Animal;

public class Wolf extends Animal implements Canine {

    int skullSize;
    boolean isCarnivore;

    public Wolf(){

    }

    public Wolf(int skullSize, boolean isCarnivore) {
        this.skullSize = skullSize;
        this.isCarnivore = isCarnivore;
    }


    public boolean isHowling(boolean isFullMoon){

        return isFullMoon;
    }

    public boolean preyLarge(boolean isGroup){

        return isGroup;
    }

    @Override
    public boolean hasWinterCoat(int temp) {
        return false;
    }


    @Override
    public boolean isPeopleShy(boolean isFull) {
        return false;
    }
}
