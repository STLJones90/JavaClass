package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(response('R'));
        System.out.println(nextColor('R'));
    }

public static char response(char color)
{
    if (color=='R')
    {
        return 'S';
    }

    if (color=='Y')
    {
        return 'C';
    }

    if (color=='G')
    {
        return 'G';
    }

    else
    {
        return 'E';
    }
}

public static char nextColor(char color)
{
    if (color=='R')
    {
        return 'G';
    }

    if (color=='G')
    {
        return 'Y';
    }

    if (color=='Y')
    {
        return 'R';
    }

else return 'E';

}






}
