package com.company;

public class Main
{

    public static void main(String[] args)
    {

        int num1 = 1;

        while (num1 < 200)
        {
            if ((num1 % 11 == 0))
            {
                System.out.println(num1);
            }
            num1++;


        }
    }
}

//remainder has to equal zero
//Print if % (remainder) == zero
//1 plus 1 in perenthesis divided by 11
//11 == int num1
//1 plus 1 == int num2
//while num2 != 200 sout either num1 or num2
