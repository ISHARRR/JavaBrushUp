package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // exercise for scope - wouldn't code like this normally
        X x = new X(new Scanner(System.in));
        x.x();

    }
}
