package com.company;

public class Main {

    public static void main(String[] args)
    {
        printAverage(100);
    }

    private static void printAverage(int rolls)
    {
        java.util.Random random = new java.util.Random();
        int roll = 0;
        int total = 0;
        while (roll<rolls)
        {
            int dice = random.nextInt(20)+1;
            System.out.println("computer rolled: " + dice);
            roll++;
            total = (dice+total);
            System.out.println("You have rolled for a total of: " + total);
        }
        int average = (total/rolls);
        System.out.println("your average roll was: " + average);
    }
}
