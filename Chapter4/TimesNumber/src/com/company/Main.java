package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter a number that will be multiplied by a factor of 1 through 10");

        int userNumber = userInput.nextInt();
        int multiplier = 1;

        if (userNumber < 1 || userNumber > 10)
        {
            System.out.println("ERROR: OUT OF RANGE");
        }


        else while (multiplier < 11)
        {
            System.out.println(userNumber + " x " + multiplier + " = " + (userNumber * multiplier));
            multiplier++;
        }


    }
}
