package com.company;

public class Main {

    public static void main(String[] args) {
        //int has width of 32
        int myValue = 100;
        //byte has a width of 8
        byte mybyteValue = -128;
        //short has a width of 16
        short myShortValue = 32239;
        //long has a width of 64 - need "L" at the end
        long myLongValue = 93838383339878L;

        //(byte) is casting = treat as byte
        byte myNewByteValue = (byte) (mybyteValue/2);

        long task = myLongValue+myValue+mybyteValue+myShortValue;
        System.out.println(task);

    }
}
