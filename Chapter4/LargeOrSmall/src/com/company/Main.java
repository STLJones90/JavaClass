package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int number = userInput.nextInt();

        if (number > 99)
        {
            System.out.println("The number is large");
        }

        else if (number < 10)

        System.out.println("The number is small");

        else if (number > 10 && number < 99)
        {
            System.out.println("The number is neither large nor small");
        }

    }
}
