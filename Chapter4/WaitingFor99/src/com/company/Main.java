package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("guess a number between 1 and 100 \n if your number is not the correct, guess again");

int userNumber;

        do
        {
            System.out.println("Try Again");
            userNumber = userInput.nextInt();
        }

            while (userNumber != 99) ;

            System.out.println("99 I've been waiting so long");



    }
}
