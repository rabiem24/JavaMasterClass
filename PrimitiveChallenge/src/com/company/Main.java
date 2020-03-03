package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 16;
        int intValue = 23_6245;
        short myShortValue = 12_594;
        long myLongValue = 500000L + 10L * (byteValue + myShortValue + intValue);
        System.out.println(myLongValue);
    }
}
