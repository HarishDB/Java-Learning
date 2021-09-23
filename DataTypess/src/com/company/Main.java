package com.company;

import static java.lang.Character.MAX_VALUE;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ////////////////////////////////////////////////////////////////
    /*    int Val = 10000;

        int MinIntVal= Integer.MIN_VALUE;
        int MaxIntVal= Integer.MAX_VALUE;
        System.out.println("Integer min = " + MinIntVal);
        System.out.println("Integer max = " + MaxIntVal);
        System.out.println("Busted Max = " + (MaxIntVal + 1));
        System.out.println("Busted Min = " + (MinIntVal - 1));

        byte MinByte = Byte.MIN_VALUE;
        byte MaxByte = Byte.MAX_VALUE;
        System.out.println("Byte min = " + MinByte);
        System.out.println("Byte max = " + MaxByte);

        short MinShort = Short.MIN_VALUE;
        short MaxShort = Short.MAX_VALUE;
        System.out.println("Short min = " + MinShort);
        System.out.println("Short max = " + MaxShort);

        long MinLong = Long.MIN_VALUE;
        long MaxLong = Long.MAX_VALUE;
        System.out.println("Long min = " + MinLong);
        System.out.println("Long max = " + MaxLong);

        byte chalByte = 10;
        short chalShort = 20;
        int chalInt = 30;
        long chalLong= 50000L + (long)(10 * (chalByte + chalShort + chalInt));
        System.out.println(chalLong);
///////////////////////////////////////////////////////////////
     */
        //   float myfloat = (float)5.25;
////////////////////////////////////////////////////////
        /*
        int pound = 200;
        double Kilo = (double) (pound * 0.45_359_237);
        System.out.println("Value of " + pound + " pounds in Kilo is = " + Kilo);

         */
/////////////////////////////////////////////////////////
/*
        char myUnicode = '\u0044'; // unicode website
        System.out.println(myUnicode);

 */
////////////////////////////////////////////////////////////
/*
        char c = 'a';
        System.out.println(Character.SIZE);

 */
//        double a = 20.00;
//        double b = 80.00;
//        double c = (a + b) * 100.00;
//        double d = c % 40.00;
//        boolean e = (d == 0) ? true : false;
//        System.out.println(e);
//        if (!e)
//            System.out.println("Got some remainder");
        String Name ;
        int position ;


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

    public static int calculateHighScorePosition(int score){
        if(score > 1000)
            return 1;
        else if(score > 500 && score<1000)
            return 2;
        else if(score>100 && score<500)
            return 3;
        else
            return 4;
    }
}
