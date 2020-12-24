package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " is eating");
    }

    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
