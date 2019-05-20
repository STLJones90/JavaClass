package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter a number between 0 and 50");
        int userNumber = userInput.nextInt();
        int tries=1;

        if (userNumber != 0)
        do
        {
            System.out.println("Enter another number");
            ++tries;
            userNumber = userInput.nextInt();
        }
        while (userNumber != 0) ;


        if (userNumber == 0)
        {
            System.out.println("you win and it took you: " + tries + " tries");

        }

    }
}
