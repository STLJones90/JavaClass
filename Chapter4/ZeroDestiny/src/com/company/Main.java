package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("enter a number");

        int userNumber = userInput.nextInt();
        int one = 0;

        while (userNumber != 0)
        {
            System.out.println("Enter a different number");
            one++;
            userNumber=userInput.nextInt();
        }
        System.out.println("Congratulations! You found the number!");
        System.out.println("You entered a number other than zero: " +one+ " times");























    }
}
