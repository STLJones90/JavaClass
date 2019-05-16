package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        //FIY for user
        System.out.println("When towing a trailer behind your vehicle it is important to " +
                "adjust the cargo on the trailer to achieve a tongue weight between 9% and 15% " +
                "of the total weight of the trailer and cargo");
        //entered a space between outputs
        System.out.println(" ");


        System.out.println("Enter the numerical weight in pounds (lb) of the trailer (no decimals)");

        int trailer = userInput.nextInt();

        System.out.println("Enter the numerical weight in pounds (lb) of the cargo(no decimals)");

        int cargo = userInput.nextInt();

        double totalWeight = cargo + trailer;

        System.out.println("Total weight of cargo + trailer = " + totalWeight);

        double minWeight = (totalWeight * 0.09);

        double maxWeight = (totalWeight * 0.15);

        System.out.println("The minimum tongue weight is: " + minWeight);
        System.out.println("The maximum tongue weight is: " + maxWeight);





    }
}
