package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        int choice;
        System.out.println("What would you like to drink?");
        System.out.println("Press \"1\" for water");
        System.out.println("Press \"2\" for cola");
        System.out.println("Press \"3\" for ale");
        choice = userInput.nextInt();

        if (choice == 1)
        {
            System.out.println("here is your water");
        }
        else if (choice == 2)
        {
            System.out.println("here is your cola");
        }
        else if (choice == 3)
        {
            System.out.println("Enter your age");

        int choice2;
        choice2 = userInput.nextInt();

        if (choice2 <20)
        {
            System.out.println("no drink for you come back in " + (-(choice2 -21)) + " years!");
        }
        if (choice2 == 20)
        {
            System.out.println("no drink for you, come back next year!");
        }
        if (choice2 >= 21)
        {
            System.out.println("Here is your ale");
        }



        }
}}
