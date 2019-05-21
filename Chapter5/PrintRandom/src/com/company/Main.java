package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int max =5;
        printRandomNumber(max);

    }


    private static void printRandomNumber(int max)
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max)+1;
        System.out.println(number);


    }
}
