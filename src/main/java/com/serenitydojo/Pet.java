package com.serenitydojo;

abstract public class Pet {
    private String name;
    
    public int getAge() {
        return age;
    }
    
    private int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age =age;
    }
    abstract String play();
    
    public String getName() {
        return name;
    }
}
