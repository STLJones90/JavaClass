package com.company;

public class Main {

    public static void main(String[] args)
    {
        printHeader();
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        java.util.Random random1 = new java.util.Random();

        boolean evenEm = true;
        String firstName;
        String lastName;
        int employeePassword = random.nextInt(99999)+11111;
        int currentYear = 2019;

        System.out.println("Enter your birth year");
        int birthYear=input.nextInt();
        System.out.println("Enter your first name: ");
        firstName=input.next();
        System.out.println("Enter your last name: ");
        lastName=input.next();
        System.out.println("Please enter your 5 digit employee number: ");
        int employeeNumber = input.nextInt();
        evenEm = (employeeNumber%2==0);
        System.out.println(" ");
        System.out.println(lastName+", " + firstName);
        System.out.println("Your age is: " + (currentYear-birthYear));
        System.out.println("Employee number is even: " + evenEm);
        System.out.println("Employee's random secret password is: " + employeePassword);


    }

    private static void printHeader()
    {
        System.out.println("Welcome to WallabyTech Employee Application");
        System.out.println("===========================================");
    }


}
