package com.example;

public abstract class Animal {
    private final int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Animal walks on " + legs + " legs !");    }

    public abstract void eat();
}
