package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        com.example.game.Player ishar = new com.example.game.Player("Ishar", 10, 15);
        System.out.println(ishar.toString());
        saveObject(ishar);

        ishar.setHitPoints(8);
        System.out.println(ishar);
        ishar.setWeapon("Big Stick");
        saveObject(ishar);
        System.out.println(ishar);

        com.example.game.ISaveable monster = new com.example.game.Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((com.example.game.Monster) monster).getStrength());
        saveObject(monster);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(com.example.game.ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(com.example.game.ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
