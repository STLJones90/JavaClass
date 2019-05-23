package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int wrongSelection = 0;
        boolean worthyCustomer = true;
        int totalItems=0;
        int totalW=0;
        int totalH=0;
        int totalG=0;
        int totalP=0;

        while (worthyCustomer==true)
        {
            displayMenu();
            String choice = input.next();


            switch (choice)
            {
                case "W":
                case "w":
                    totalW++;
                    totalItems++;
                    if (totalW > 3 || totalItems > 10)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again later\n");
                    }
                    else
                    W();
                        break;
                case "H":
                case "h":
                    totalH++;
                    totalItems++;
                    if (totalH > 3 || totalItems > 10)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again later\n");
                    }
                    else
                    H();
                    break;
                case "G":
                case "g":
                    totalG++;
                    totalItems++;
                    if (totalG > 3 || totalItems > 10)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again later\n");
                    }
                    else
                    G();
                    break;
                case "P":
                case "p":
                    totalP++;
                    totalItems++;
                    if (totalP > 3 || totalItems > 10)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again later\n");
                    }
                    else
                    P();
                    break;

                case "Squirrel":
                    totalG=0;
                    totalH=0;
                    totalP=0;
                    totalW=0;
                    totalItems=0;
                    break;

                default:
                    if (wrongSelection<1)
                    {
                        wrongSelection++;

                        System.out.println("Invalid selection. Try that again and it's off to the Perl Dome with you! \n");
                    }
                    else
                {
                    System.out.println("You were warned. Off to the Perl Dome with you!\n");
                }

            }
        }
    }

    private static void W()
    {
        System.out.println("Here is your package of Wasteland Wombat Womps\n");
    }

    private static void H()
    {
        System.out.println("Here is your package of Hero not Needed Wafers\n");
    }

    private static void G()
    {
        System.out.println("Here is your package of Gas Running Out Energy Bar\n");
    }

    private static void P()
    {
        System.out.println("Here is your package of Pig Parts Paradise\n");
    }


    private static void displayMenu()
    {
        System.out.println("Welcome to Perl Dome vending machine\n");
        System.out.println("Press W for Wasteland Wombat Womps");
        System.out.println("Press H for Hero not Needed Wafers");
        System.out.println("Press G Gas Running Out Energy Bar");
        System.out.println("Press P for Pig Parts Paradise\n");
    }


}
