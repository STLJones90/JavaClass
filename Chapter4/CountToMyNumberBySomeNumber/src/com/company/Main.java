package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter the number you want to count to");
        int maxCount = userInput.nextInt();
        System.out.println("Enter the number you want to count to your previous number by");
        int step = userInput.nextInt();
        System.out.println("0");
        while (0 + step <= maxCount)
        {
            System.out.println(step);
            step += step;
        }
        System.out.println(maxCount);




















    }
}
