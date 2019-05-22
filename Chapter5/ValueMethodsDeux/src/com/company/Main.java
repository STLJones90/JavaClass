package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String a = getMyFancyName("!!!");
        System.out.println(a);
        System.out.println(getTotal(12, 12));
        System.out.println(max(2,2));
        System.out.println(isThunderDome(2,2));
    }

    public static String getMyFancyName(String decoration)
    {
        String equal = "equal";
        String name = decoration + "Austin" + decoration;
        return name;

    }


    public static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = (firstNumber + secondNumber);
        return sum;
    }

    public static int max(int max1, int max2)
    {

        if (max1>max2)
        {
            return max1;
        }

        else if (max1<max2)
        {
            return max2;
        }

        else
        {
            return max1 & max2;
        }

    }

    public static boolean isThunderDome(int enteredCount, int leavingCount)
    {
        boolean boo1=true;
        boolean boo2=false;

        if (enteredCount == 1 && leavingCount == 2)
        {
            return boo1;
        }

        else
        {
            return boo2;
        }
    }


}