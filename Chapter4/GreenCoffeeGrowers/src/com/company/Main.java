package com.company;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Press \"1\" if you ride a bicycle");
        System.out.println("Press \"2\" if you ride the bus");


        int bike = 1;
        int bus = 2;

            if (userInput.nextInt() == bike)

            {
                System.out.println("How many miles do you commute to work?");

                int bikeMiles = userInput.nextInt();
                if (bikeMiles < 21)
                {
                    System.out.println("Congrats, you get a free coffee!");
                }
                if (bikeMiles < 50 && bikeMiles > 30)
                {
                    System.out.println("Congrats! you get a 20% discount!");
                }

                if (bikeMiles < 30)
                {
                    System.out.println("Congrats! You get a 30% discount!");
                }
            }

        else
        {
            System.out.println("How many miles do you commute to work?");

        }
       int busMiles = userInput.nextInt();

        if (busMiles > 35 && busMiles < 50)
        {
            System.out.println("Congrats! You get a 50% discount");
        }
        else if (busMiles > 35)
        {
            System.out.println("Congrats! You get a 20% discount!");
        }

        else if (busMiles < 50)
        {
            System.out.println("Congrats! You get a 30% discount!");
        }

        else
        {
            System.out.println("Sorry, no discounts");
        }

























    }
}
