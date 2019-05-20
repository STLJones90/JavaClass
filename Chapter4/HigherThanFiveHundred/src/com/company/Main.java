package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber=0;
        int total = userNumber;
        int totalNumbers=0;

        do
        {
            userNumber = input.nextInt();
            total = (userNumber + total);
            System.out.println("Your number: " + userNumber + " total: " + total);
            totalNumbers++;
        }

        while (total < 500);

        System.out.println("You reached a total of " +total+ " to finally obtain a total greater than 500");
        System.out.println("It took you " + totalNumbers + " numbers");


    }
}
