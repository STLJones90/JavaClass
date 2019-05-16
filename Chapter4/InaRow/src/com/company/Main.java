package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter three numbers");
        int x = userInput.nextInt();
        int y = userInput.nextInt();
        int z = userInput.nextInt();

        if (++x == y && ++y == z)
        {
            System.out.println("In a row!");
        }

        else
        {
            System.out.println("Not in a row!");
        }









    }
}
