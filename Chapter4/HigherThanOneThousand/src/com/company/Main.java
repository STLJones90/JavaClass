package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter a number");

        int userNumber = userInput.nextInt();
        int counter = 1;


        while (userNumber <= 1000)
        {

            System.out.println("Enter another number");

            userNumber += userInput.nextInt();
            counter++;

        }

            System.out.println("You reached a total of " + userNumber + " to finally obtain a total greater than 1000");

        if (counter==1)
        {
            System.out.println("You entered " + counter + " number");
        }
        else
        {
            System.out.println("You entered " + counter + " numbers");
        }




    }
}
