package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter height in inches");
        int userHeight = userInput.nextInt();

        if (userHeight < 36)
        {
            System.out.println("red band");
        }
        else if (userHeight > 36 && userHeight < 54)
        {
            System.out.println("yellow band");
        }
        else if (userHeight >= 54 && userHeight <= 80)
        {
            System.out.println("green band");
        }
        else if (userHeight > 80)
        {
            System.out.println("no band, banish them to the \"Hall of Industry\" ");
        }


    }
}
