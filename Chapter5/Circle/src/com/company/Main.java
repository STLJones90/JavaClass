package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double area = (getArea(4));
        double diameter=(getDiameter(12));
        double circumference=getCircumference(getDiameter(diameter));
        System.out.println("The circumference of the circle is: " + circumference);

    }


    public static double getArea(double radius)
    {
        double area = ((radius * 3.14)*(radius*3.14));
        return area;
    }

    public static double getDiameter(double radius)
    {
        double diameter=(2*radius);
        return diameter;
    }

    public static double getCircumference(double diameter)
    {
     double circumference=(3.14*diameter);
     return circumference;
    }


}
