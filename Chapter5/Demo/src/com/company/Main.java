package com.company;

public class Main
{

    public static void main(String[] args)
    {
        sayHi();
        sayHi();
        System.out.println("Hello there");
        System.out.println("I'm back");

        int count = 0;
        while (count < 10)
        {
            sayHi();
            count++;
        }
        String title = "Manager";
        printName("Austin");
    }

        private static void sayHi ()
        {
            System.out.println("Hi there!");
        }


        private static void printName (String name)
        {
            System.out.println(name);
        }


    }
