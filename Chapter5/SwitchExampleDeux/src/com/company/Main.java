package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        int dayOfTheWeek = input.nextInt();

        switch (dayOfTheWeek)
        {
            case (1):
                System.out.println("It's Sunday");
                break;

            case (2):
                System.out.println("It's Monday");
                break;

            case (3):
                System.out.println("It's Tuesday");
                break;

                //etc.

            default:
                System.out.println("Invalid value: "+ dayOfTheWeek );
        }


    }
}
