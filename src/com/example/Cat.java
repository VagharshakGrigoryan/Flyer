package com.example;

public class Cat extends Animal implements Pet {
    private String name;

    @Override
    public String getname() {
        return null;
    }


    public void eat() {
        System.out.println("Cat eat mouse");
    }


    public Cat() {
        super(4);
        this.name = "Murka";
    }


    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public String getName() {

        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void play() {
        System.out.println("Cat plays with mouse ");
    }

}
