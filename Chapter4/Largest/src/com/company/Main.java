package com.company;

public class Main {

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        if (num1 > num2)
        {
            System.out.println("The largest number is: " + num1);
        }
        else if (num2 > num1)
        {
            System.out.println("The largest number is " + num2);
        }

        else if (num1 == num2)
        {
            System.out.println("The numbers are equal");
        }
    }}


