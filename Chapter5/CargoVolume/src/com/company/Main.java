package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(getCargoVolume(10.5, 12.5, 15.5, false));
    }

    public static double getCargoVolume(double height, double length, double depth, boolean heavyDuty)
    {

        if (heavyDuty == true)

        {
            double materialThickness = .5;
            double interiorVolume = ((height - (2 * materialThickness)) * (length - (2 * materialThickness)) * (depth - (2 * materialThickness)));
            return interiorVolume;
        }

        else
        {
            double materialThickness = .25;
            double interiorVolume = ((height - (2 * materialThickness)) * (length - (2 * materialThickness)) * (depth - (2 * materialThickness)));
            return interiorVolume;
        }
    }

}
