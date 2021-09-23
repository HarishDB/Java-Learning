package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int position;


        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Hari", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("sss", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("oooo", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("kkkk", position);
    }

    public static void displayHighScorePosition(String N, int P) {
        System.out.println(N + " managed to get into position " + P + " on  the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100 && score < 500)
            return 3;
        else
            return 4;
    }
}
