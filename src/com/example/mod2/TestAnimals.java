package com.example.mod2;

import com.example.Animal;
import com.example.Cat;
import com.example.Fish;
import com.example.Spider;

public class TestAnimals {

    static Cat myCat = new Cat("Tiger");
    static Animal mySpider = new Spider();
    static Animal myFish = new Fish();

    public static void main(String[] args) {
        mySpider.walk();
        mySpider.eat();

        System.out.println();
        System.out.println(myCat.getName());
        myCat.walk();
        myCat.play();
        myCat.eat();

        System.out.println();
        ((Fish) myFish).setName("Bulbul");
        System.out.println(((Fish) myFish).getname());
        myFish.walk();
        myFish.eat();
        ((Fish) myFish).play();
    }
}
