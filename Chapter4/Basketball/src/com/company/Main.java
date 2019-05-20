package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Random random = new java.util.Random();
        java.util.Random random2 = new java.util.Random();
        java.util.Random random3 = new java.util.Random();
        java.util.Random random4 = new java.util.Random();
        int threePointer = 2;
        int walk = 3;
        int twoPointer = 4 & 6;
        int foulShot = 5;
        int doubleDribble = 7;
        int twoFoulShots = 8;
        int missJumpShot = 9;
        int and1 = 10;
        int offensiveFoul = 0;
        int player1Score = 0;
        int player2Score = 0;
        int die1;
        int die2;
        int die3;
        int die4;

        do

        {
            die1 = random.nextInt(6) + 1;
            die2 = random2.nextInt(6) + 1;
            die3 = random3.nextInt(6) + 1;
            die4 = random4.nextInt(6) + 1;

            if (die1 + die2 == threePointer)
            {
                player1Score +=3;
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 makes a three pointer!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == walk)
            {
                System.out.println("Player 1 rolls: " + die1 + die2);
                System.out.println("Player 1 travel");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == twoPointer)
            {
                player1Score +=2;
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 makes a two pointer!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == foulShot)
            {
                player1Score++;
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 fouls");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == doubleDribble)
            {
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 double dribbles");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == twoFoulShots)
            {
                player1Score += 2;
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 gets and makes 2 foul shots");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == missJumpShot)
            {
                System.out.println("Player 1 rolls: " + die1 + " and " + die2);
                System.out.println("Player 1 misses jump shot");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die2 == and1)
            {
                player1Score += 3;
                System.out.println("Player 1 rolls: " + die1 + " and " + die1);
                System.out.println("Player 1 And1!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == offensiveFoul)
            {
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 gets commits and offensive foul");
                System.out.println("Player 1 score: " + player1Score);
            }

            if (die3 + die4 == threePointer)
            {
                player2Score +=3;
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 makes a three pointer!");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == walk)
            {
                System.out.println("Player 2 rolls: " + die3 + die4);
                System.out.println("Player 2 travel");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == twoPointer)
            {
                player2Score +=2;
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 makes a two pointer!");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == foulShot)
            {
                player2Score++;
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 fouls");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == doubleDribble)
            {
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 double dribbles");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == twoFoulShots)
            {
                player2Score += 2;
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 gets and makes 2 foul shots");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == missJumpShot)
            {
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 misses jump shot");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == and1)
            {
                player2Score += 3;
                System.out.println("Player 2 rolls: " + die3 + " and " + die4);
                System.out.println("Player 2 And1!");
                System.out.println("Player 2 score: " + player2Score);
            }

            else if (die3 + die4 == offensiveFoul)
            {
                System.out.println("Player 2 rolls: " + die3 + die4);
                System.out.println("Player 2 gets commits and offensive foul");
                System.out.println("Player 2 score: " + player2Score);
            }

        }
        while (player1Score <= 21 && player2Score <= 21);
        {
            if (player1Score>=21)
            {
                System.out.println("Player 1 wins!");
            }
            if (player2Score>=21)
            {
                System.out.println("Player 2 wins");
            }
        }

    }
}












    /* if (die1 + die1 == threePointer)
            {
                player1Score = +3;
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 makes a three pointer!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == walk)
            {
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 travel");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == twoPointer)
            {
                player1Score = +2;
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 makes a two pointer!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == foulShot)
            {
                player1Score++;
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 fouls");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == doubleDribble)
            {
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 double dribbles");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == twoFoulShots)
            {
                player1Score += 2;
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 gets and makes 2 foul shots");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == missJumpShot)
            {
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 misses jump shot");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == and1)
            {
                player1Score += 3;
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 And1!");
                System.out.println("Player 1 score: " + player1Score);
            }

            else if (die1 + die1 == offensiveFoul)
            {
                System.out.println("Player 1 rolls: " + die1 + die1);
                System.out.println("Player 1 gets commits and offensive foul");
                System.out.println("Player 1 score: " + player1Score); */


