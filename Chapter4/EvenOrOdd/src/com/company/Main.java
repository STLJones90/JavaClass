package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter in 2 numbers");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        boolean num1Even = num1 % 2 == 0;
        boolean num1Odd = num1 % 2 == 1;
        boolean num2Even = num2 % 2 == 0;
        boolean num2Odd = num2 % 2 == 1;

        if (num1Even && num2Even)
        {
            System.out.println("Your number is even");
        }

        if (num1Even && num2Odd)
        {
            System.out.println("Your number is odd");

        }

        if (num1Odd && num2Odd)
        {
            System.out.println("Your number is even");
        }


    }
}

