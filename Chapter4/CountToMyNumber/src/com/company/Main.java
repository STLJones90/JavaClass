package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter a number greater than or equal to 0");
        int maxCount = userInput.nextInt();
        int int2 = 0;

        while (maxCount > -1 && int2 <= maxCount)
        {
            System.out.println(int2);
            int2++;
        }
            if (maxCount < 0)
            {
                System.out.println("Number cannot be less than 1");
            }
        }







    }
