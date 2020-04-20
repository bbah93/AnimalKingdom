package com.floreo.bbah.canine;

public interface Canine {

    boolean hasWinterCoat = false;
    boolean isPeopleShy = false;

    public boolean hasWinterCoat(int temp);

    public boolean isPeopleShy(boolean isFull);
}
