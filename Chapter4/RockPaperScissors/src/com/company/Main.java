package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        java.util.Scanner userInput2 = new java.util.Scanner(System.in);
        java.util.Random random1 = new java.util.Random();
        System.out.println("Press 1 to start");
        int startGame = userInput2.nextInt();
        int compRock = 0;
        int compPaper = 1;
        int compScissors = 2;
        int userRock = 0;
        int userPaper = 1;
        int userScissors = 2;
        int losses = 0;
        int wins = 0;

        while (startGame == 1 && wins < 3 && losses < 3)
        {
            System.out.println("press 0 for Rock, 1 for Paper, or 2 for Scissors!");
            System.out.println("First to 3 wins, wins!");
            int userChoice = userInput.nextInt();
            int compChoice = random1.nextInt(3);

            if (userChoice == userRock)
            {
                System.out.println("You chose Rock.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, it's a tie!.");
                }


                else if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. You win!");
                    ++wins;
                }

                else if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. You lose!");
                    losses++;
                }
            }


            else if (userChoice == userPaper)
            {
                System.out.println("You chose Paper.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, You win!.");
                    wins++;
                }


                if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. You lose!");
                    ++losses;
                }

                if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. It's a tie!");
                }

            }

            else if (userChoice == userScissors)
            {
                System.out.println("You chose scissors.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, You lose!.");
                    losses++;
                }


                if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. It's a tie!");
                }

                if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. You win!");
                    wins++;
                }

            }

            if (wins == 3)
            {
                System.out.println("You win the game!");
            }

            if (losses == 3)
            {
                System.out.println("You lost the game!");
            }
        }


    }

}

