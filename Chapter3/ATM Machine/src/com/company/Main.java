package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        double balance;
        int surcharge = 1;
        double convenienceFee = .1;
        ///$1 surcharge added to each transaction
        /// 10 cent convenience fee added for every bill disposed

        System.out.println("How much would you like to withdrawal today?");
        double withdrawal = userInput.nextInt();
        System.out.println("There is a convenience fee of $1 per transaction and 10 cents per bill dispensed");
        System.out.println("How many 100s?");
        double hundredsEntered = userInput.nextDouble();
        withdrawal = (withdrawal - ((100 * hundredsEntered) + (hundredsEntered * convenienceFee)) - surcharge);
        balance = withdrawal;
        boolean boo1 = true;
        boo1 = balance > 0;
        System.out.println("positive account balance: "+ boo1);
        System.out.println(withdrawal + " dollars left ");


        System.out.println("how many 20s");
        double twentiesEntered = userInput.nextInt();
        balance = (balance) - ((20 * twentiesEntered) + (twentiesEntered * convenienceFee));
        boo1 = true;
        boo1 = balance > 0;
        System.out.println("positive account balance: "+ boo1);
        System.out.println(balance + " dollars left ");

        System.out.println("how many 10s");
        double tensEntered = userInput.nextInt();
        balance = (balance) - ((10 * tensEntered) + (tensEntered * convenienceFee));
        boo1 = true;
        boo1 = balance > 0;
        System.out.println("positive account balance: "+ boo1);
        System.out.println(balance + " dollars left ");

        System.out.println("how many 5s");
        double fivesEntered = userInput.nextInt();
        balance = (balance) - ((5 * fivesEntered) + (fivesEntered * convenienceFee));
        boo1 = true;
        boo1 = balance > 0;
        System.out.println("positive account balance: "+ boo1);
        System.out.println(balance + " dollars left ");

        System.out.println("how many 1s");
        double onesEntered = userInput.nextInt();
        balance = (balance) - ((onesEntered) + (onesEntered * convenienceFee));
        boo1 = true;
        boo1 = balance > 0;
        System.out.println("positive account balance: "+ boo1);
        System.out.println(balance + " dollars left ");
        System.out.println("any remaining balance will be redeposited into your account");

        //adding up total amount of convenience fees charged to customer
        convenienceFee = .1 * (hundredsEntered + twentiesEntered + tensEntered + fivesEntered + onesEntered);
        System.out.println();
        System.out.println("total convenience fee: $" + convenienceFee);

    }
}
