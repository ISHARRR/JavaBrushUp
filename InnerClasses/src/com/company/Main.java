package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gearbox rangeRover = new Gearbox(8);
        rangeRover.addGear(9, 20);
        rangeRover.operateClutch(false);
        rangeRover.changeGear(4);
        rangeRover.operateClutch(true);
        rangeRover.changeGear(4);

    }
}