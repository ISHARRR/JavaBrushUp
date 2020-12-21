package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayHighScorePosition("jimmy", 500);
    }

    public static void displayHighScorePosition(String name, int score) {
        int position = calculateHighScorePosition(score);
        System.out.println(name + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }

        return position;

//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        } else {
//            return 4;
//        }
    }
}
