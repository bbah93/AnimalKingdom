package com.floreo.bbah.canine;

public class Fox implements Canine {

    boolean isSolitary;
    boolean isOmnviore;

    public Fox(boolean isSolitary, boolean isOmnviore) {
        this.isSolitary = isSolitary;
        this.isOmnviore = isOmnviore;
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
