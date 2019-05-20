package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("What is your name?");
        String name = userInput.next();
        System.out.println("Hello, " + name + "! Try to guess the computer's number. You only have 5 guesses!");
        System.out.println("Press \"1\" to begin");
        int answer = userInput.nextInt();
        int gamesPlayed = 0;
        double totalGuessCounter = 0;
        int gameOver = 4;

/*anytime the user is asked to start or to continue they will be asked to press "1". Pressing "1" sets the variable "answer"
to 1 and allows the program to function. When 4 wrong guesses are entered gameOver initiates. Only the first instruction in
"Gold" is completed here. I did not complete "count the losses but do not include them in the average guesses to win" nor
"show total number of losses"
 */


        while (answer == 1)
        {
            int wrongAnswers = 0;
            int perGameCounter = 0;
            perGameCounter++;
            gamesPlayed++;
            totalGuessCounter++;

            System.out.println("pick a number one through 100");

            java.util.Random Random = new java.util.Random();
            int randomNumber = Random.nextInt(100);
            int userGuess = userInput.nextInt();


            while (userGuess != randomNumber && wrongAnswers < 4)
            {
                if (userGuess < randomNumber)
                {
                    System.out.println("Too low, guess again");
                    perGameCounter++;
                    totalGuessCounter++;
                    userGuess = userInput.nextInt();
                }

                if (userGuess > randomNumber)
                {
                    System.out.println("Too high, guess again");
                    perGameCounter++;
                    totalGuessCounter++;
                    userGuess = userInput.nextInt();
                }

                if (userGuess != randomNumber)
                {
                    ++wrongAnswers;
                }

                if (gameOver == wrongAnswers)
                {
                    System.out.println("You have lost. Press \"1\" to play again");
                    answer = userInput.nextInt();
                }

            }
            if (userGuess == randomNumber)
            {
                System.out.println("Congrats, " + name + ", you guessed correctly!");
                System.out.println("It took you " + perGameCounter + " guesses!");
                System.out.println("Games Played = " + gamesPlayed);
                System.out.println("Average number of guesses per game: " + (totalGuessCounter / gamesPlayed));
                System.out.println("Would you like to play again? press \"1\" for yes and \"2\" for no");
                answer = userInput.nextInt();

            }

            if (answer != 1)
            {
                System.out.println("Thank you for playing");
            }


        }

    }
}