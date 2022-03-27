package com.example;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
        name = "Goldy";
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setName(String n) {
        name = n;

    }

    @Override
    public void play() {
        System.out.println("Fish dont play");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat mealsy");
    }

    public void walk() {
        System.out.println("Fish dont walk, shes swim all day");
    }
}
