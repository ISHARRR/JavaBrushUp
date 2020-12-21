package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here - with of 32
        int myIntValue = 5/3;
        // float denoted with 'f' - with of 32
        float myFloatValue = 5f/3f;
        // double denoted with 'd' - with of 64
        double myDoubleValue = 5d/3d;
        System.out.println("my int value = " + myIntValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value = " + myDoubleValue);

        double numPounds = 200d;
        double poundsToKilos = 0.45359237d;

        System.out.println(numPounds + " in Kilograms is equal to " + numPounds*poundsToKilos);

    }
}
