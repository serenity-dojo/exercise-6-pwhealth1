package com.serenitydojo;

public class Hamster extends Pet
{
    String favoriteToy;
    
    public Hamster(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }
    
    @Override
    String play() {
        return "runs on wheel";
    }
}
