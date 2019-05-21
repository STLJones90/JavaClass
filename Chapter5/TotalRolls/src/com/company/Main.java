package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printTotalRolls(20);
    }


    private static void printTotalRolls(int rolls)
    {
        java.util.Random random = new java.util.Random();

        int roll = 1;
        int total=0;
        while (roll < rolls)
        {
            int dice = random.nextInt(20) + 1;
            System.out.println(dice);
            roll++;
            total = (dice+=total);
        }
        System.out.println(total);

    }
}
