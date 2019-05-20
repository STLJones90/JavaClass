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
        System.out.println("First to 3 wins, wins!\n");
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
            System.out.println("press 0 for Rock, 1 for Paper, or 2 for Scissors!\n");
            int userChoice = userInput.nextInt();
            int compChoice = random1.nextInt(3);

            if (userChoice == userRock)
            {
                System.out.println("You chose Rock.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, it's a tie!.\n");
                }


                else if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. You win!\n");
                    ++wins;
                }

                else if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. You lose!\n");
                    losses++;
                }

                System.out.println("wins: " + wins);
                System.out.println("losses: " + losses + ("\n___________"));
            }


            else if (userChoice == userPaper)
            {
                System.out.println("You chose Paper.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, You win!\n");
                    wins++;
                }


                if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. You lose!\n");
                    ++losses;
                }

                if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. It's a tie!\n");
                }

                System.out.println("wins: " + wins);
                System.out.println("losses: " + losses + ("\n___________"));

            }

            else if (userChoice == userScissors)
            {
                System.out.println("You chose scissors.");

                if (compChoice == compRock)
                {
                    System.out.println("Computer chose Rock, You lose!.\n");
                    losses++;
                }


                if (compChoice == compScissors)
                {
                    System.out.println("Computer chose scissors. It's a tie!\n");
                }

                if (compChoice == compPaper)
                {
                    System.out.println("Computer chose paper. You win!\n");
                    wins++;
                }

                System.out.println("wins: " + wins);
                System.out.println("losses: " + losses + ("\n___________"));

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

