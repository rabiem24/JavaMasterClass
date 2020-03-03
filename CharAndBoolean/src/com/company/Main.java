package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myUnicodeChar);

        boolean isAleien = false;

        if (isAleien == true) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens!");
        }

        double myFirstNumber = 20.00d;
        double mySecondNumber = 80.00d;
        double add = 6 / 3 * 8 - 4 + 10;
        System.out.println("Total: " + add);
        double remainder = add % 40.00d;

        boolean remainderIsTrue = remainder == 0 ? true : false;
        System.out.println(remainderIsTrue);
        if (!remainderIsTrue)
            System.out.println("Got some remainder");
        
    }
}
