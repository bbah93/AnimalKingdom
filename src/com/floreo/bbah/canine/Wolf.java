package com.floreo.bbah.canine;


public class Wolf implements Canine {

    int skullSize;
    boolean isCarnivore;

    public Wolf(int skullSize, boolean isCarnivore) {
        this.skullSize = skullSize;
        this.isCarnivore = isCarnivore;
    }

    @Override
    public boolean hasWinterCoat(int temp) {
        return false;
    }

    @Override
    public boolean isPeopleShy(boolean isFull) {
        return false;
    }

    public boolean isHowling(boolean isFullMoon){

        return isFullMoon;
    }

    public boolean preyLarge(boolean isGroup){

        return isGroup;
    }
}
