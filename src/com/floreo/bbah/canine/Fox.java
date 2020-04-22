package com.floreo.bbah.canine;


import com.floreo.bbah.Animal;

public class Fox extends Animal implements Canine {

    boolean isSolitary;
    boolean isOmnivore;

    public Fox(boolean isSolitary, boolean isOmnivore) {
        this.isSolitary = isSolitary;
        this.isOmnivore = isOmnivore;
    }

    @Override
    public boolean hasWinterCoat(int temp) {
        return false;
    }

    @Override
    public boolean isPeopleShy(boolean isFull) {
        return false;
    }

    public boolean tchoffo(boolean isTchoffing){

        return isTchoffing;
    }
}
