package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Bingo
{

    Random roll = new Random();
    HashSet<Integer> numbers = new HashSet<>();
    Scanner userInput = new Scanner(System.in);


    public void run()
    {
        System.out.println("Welcome to Bingo\nPress:\n\'C\' to call a number\n\'P\' to print the list of called numbers");
        System.out.println("\'V\' to verify that a number has not been called more than once");
        System.out.println("\'R\' to remove a called number\n\'B\' to call Bingo!");

        boolean keepRunning=true;

        while (keepRunning)
        {

            switch (userInput.next().toUpperCase())
            {
                case "C":
                {
                    call();
                    break;
                }

                case "P":
                {
                    print();
                    break;
                }

                case "V":
                {
                    verify();
                    break;
                }

                case "R":
                {
                    challenge();
                    break;
                }

                case "B":
                {
                    bingo();
                    break;
                }

                case "E":
                {
                    System.out.println("bye bye");
                    keepRunning = false;
                    break;
                }

                case "T":
                {
                    toGo();
                }

                default:
                    System.out.println();
            }
        }


    }
    boolean calling=true;

    public void call()
    {

        while (calling)
        {
            System.out.println("press \'A\' to pick a number yourself, \'C\' to have the computer pick one for you, or \'E\' to exit\n");
            switch (userInput.next().toUpperCase())
            {
                case "A":
                {
                    System.out.println("Enter your number\n");
                    int userChoice = userInput.nextInt();
                    numbers.add(userChoice);
                    if (userChoice < 0 || userChoice > 76)
                    {
                        System.out.println("try again, pick a number between 1 and 75\n");
                        numbers.remove(userChoice);
                    }

                    else if (userChoice > 0 && userChoice <= 15)
                    {
                        numbers.add(userChoice);
                        System.out.println("B" + userChoice + " was added\n");
                        break;
                    }

                    else if (userChoice >= 16 && userChoice <= 30)
                    {
                        numbers.add(userChoice);
                        System.out.println("I" + userChoice + " was added\n");
                        break;
                    }

                    else if (userChoice >= 31 && userChoice <= 45)
                    {
                        numbers.add(userChoice);
                        System.out.println("N" + userChoice + " was added\n");
                        break;
                    }

                    else if (userChoice >= 46 && userChoice <= 60)
                    {
                        numbers.add(userChoice);
                        System.out.println("G" + userChoice + " was added\n");
                        break;
                    }

                    else if (userChoice >= 61 && userChoice < 76)
                    {
                        numbers.add(userChoice);
                        System.out.println("O" + userChoice + " was added\n");
                        break;
                    }

                }

                case "C":
                {
                    int i = roll.nextInt(74) + 1;
                    numbers.add(i);

                    if (i > 0 && i <= 15)
                    {
                        numbers.add(i);
                        System.out.println("B" + i + " was added\n");
                        break;
                    }

                    else if (i >= 16 && i <= 30)
                    {
                        numbers.add(i);
                        System.out.println("I" + i + " was added\n");
                        break;
                    }

                    else if (i >= 31 && i <= 45)
                    {
                        numbers.add(i);
                        System.out.println("N" + i + " was added\n");
                        break;
                    }

                    else if (i >= 46 && i <= 60)
                    {
                        numbers.add(i);
                        System.out.println("G" + i + " was added\n");
                        break;
                    }

                    else if (i >= 61 && i < 76)
                    {
                        numbers.add(i);
                        System.out.println("O" + i + " was added\n");
                        break;
                    }

                }

                case "E":
                {
                    calling = false;
                    break;
                }

                default:
                    System.out.println("try again");
                    break;
            }

        }
        subMenu();
    }

    public void print()
    {
        System.out.println(numbers);
    }

    public void verify()
    {
        System.out.println("What number would you like to check on to see if it has been called?");
        int checkOut = userInput.nextInt();
        boolean doesCheckOut = numbers.contains(checkOut);
        System.out.println("Number entered has been called: " + doesCheckOut);
    }

    public void challenge()
    {
        System.out.println("what number would you like to remove?");
        int remove = userInput.nextInt();
        if (remove > 0 && remove < 76 )
        {
            numbers.remove(remove);
            System.out.println(remove + " was removed");
        }
        else
        {
            System.out.println("Invalid number, please enter a number between 1 and 75.");
        }
    }

    public void bingo()
    {
        if (numbers.size() > 3)
        {
            System.out.println("Congratulations, you win a fruit cake!");
        }

        else
        {
            System.out.println("Cheater!");
        }
    }

    public void toGo()
    {
        HashSet<Integer> numbersLeft = new HashSet<>();
        int one = 1;
        while (numbersLeft.size()<75)
        {
            numbersLeft.add(one);
            one++;
        }
        numbersLeft.removeAll(numbers);
        System.out.println(numbersLeft);
    }

    public void subMenu()
    {
        System.out.println("  MAIN MENU ");
        System.out.println("=============");
        System.out.println("\'C\'- call\n\'P\'- print\n\'V\'- verify\n\'R\'- remove\n\'B\'- bingo\n\'T\'- togo");
    }

}

