package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        Pigeon parrot = new Pigeon("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}