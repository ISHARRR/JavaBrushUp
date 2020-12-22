package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5 );
        Case theCase = new Case("3442", "Apple", "240" , dimensions);
        Monitor theMonitor = new Monitor("27in", "Acer", 27, new Resolution(2440, 1440));
        Motherboard motherboard = new Motherboard("jj23", "Asus", 4, 6, "v234");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();

    }
}
