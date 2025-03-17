package com.csc;

import java.util.ArrayList;

public class CheeseList {
    private final ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }
}
