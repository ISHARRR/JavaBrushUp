package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, true);
        System.out.println("starting page count = " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printing(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total is " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printing(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total is " + printer.getNumberOfPagesPrinted());

    }
}
