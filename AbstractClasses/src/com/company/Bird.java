package com.company;

public abstract class Bird extends Animal implements Flies {
    public Bird(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " is pecking");
    }

    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public void fly() {
        System.out.println(this.getName() + " is flapping its wings");
    }
}
