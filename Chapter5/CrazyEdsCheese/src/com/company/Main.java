package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean order = true;
        do
        {
            java.util.Scanner input = new java.util.Scanner(System.in);

            System.out.println("we offer cheeses in 3 diameters: 1 inch, 2 inch, and 3 inch");
            System.out.println("enter the diameter in inches of the cheese you want \n");


            String cheeseSize = input.next();

            switch (cheeseSize)
            {
                case "1":
                    System.out.println("How many yards do you want?");
                    cheese1(input.nextInt());
                    break;


                case "2":
                    System.out.println("How many yards do you want?");
                    cheese2(input.nextInt());
                    break;

                case "3":
                    System.out.println("How many yards do you want?");
                    cheese3(input.nextInt());
                    break;

                default:
                    System.out.println("Order is too crazy!");


            }
        }

        while (order=true);


    }


    private static int cheese1(int yards)
    {
        int shipping = 2 * yards;
        int cost = ((yards * 2) + (shipping))+5;
        if (yards>50)
        {
            cost=(cost-(2*yards));
        }
        System.out.println("total cost: $"+cost+"\n");
        return cost;
    }

    private static int cheese2 (int yards)
    {
        int shipping = 2 * yards;
        int cost = ((yards * 4) + (shipping))+5;
        if (yards>75)
        {
            cost=(cost-(2*yards));
        }
        System.out.println("total cost: $"+cost+"\n");
        return cost;
    }

    private static int cheese3 (int yards)
    {
        int shipping = 4 * yards;
        int cost = ((yards * 6) + (shipping))+5;
        if (yards>25)
        {
            cost=(cost-(2*yards));
        }
        System.out.println("total cost: $"+cost+"\n");
        return cost;
    }

}
