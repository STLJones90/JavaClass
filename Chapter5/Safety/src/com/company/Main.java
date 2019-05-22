package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int printSpeed = safeSpeed(20);
        System.out.println(printSpeed);

    }


    public static int safeSpeed(int neighborSpeed)
    {
        return (neighborSpeed - 15);
    }



}
