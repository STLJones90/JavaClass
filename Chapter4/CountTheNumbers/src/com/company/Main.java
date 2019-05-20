package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        while (num1<num2)
        {
            System.out.println(num1);
            num1++;

        }

        while (num1>num2)
        {
            System.out.println(num1);
            num1--;
        }

        if (num1==num2);
        System.out.println(num2);

    }
}
