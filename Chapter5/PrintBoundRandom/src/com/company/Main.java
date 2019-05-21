package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count=0;
        while (count<100)
        {
            printRandomNumber(3,11);
            count ++;
        }

    }

    private static void printRandomNumber(int min, int max)
    {
        int num1;
        int num2;
        java.util.Random random = new java.util.Random();
        java.util.Random random1 = new java.util.Random();
        num1 = random.nextInt(min);
        num2 = random1.nextInt(max);
        System.out.println(num1 + " " + num2);
    }

}
