package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("press C for circle, S for square, R for rectangle");

        String shape = input.next();

        switch (shape)
        {
            case ("C"):
            case ("c"):
                System.out.println("enter the radius of your circle");
                int radius = input.nextInt();
                System.out.println(circleArea(radius)+ " is the area of your circle");
                System.out.println(circleCircumference(radius)+" is the circumference of your circle");
                break;

            case ("S"):
            case ("s"):
                System.out.println("enter the length of a side of your square");
                int squLength = input.nextInt();
                System.out.println(squarePerimeter(squLength)+" is the perimeter of your square");
                System.out.println(squareArea(squLength)+" is the area of your square");
                break;

            case ("R"):
            case ("r"):
                System.out.println("Enter the length and width of your rectangle");
                int recLength = input.nextInt();
                int recHeight = input.nextInt();
                System.out.println(rectanglePerimeter(recLength, recHeight)+ " is the perimeter of your rectangle");
                System.out.println(rectangleArea(recLength, recHeight)+ " is the area of your rectangle");
                break;


        }


    }

    private static double circleArea(int radius)
    {
        double area = (3.14 * ((radius * radius)));
        return area;
    }

    private static double circleCircumference(int radius)
    {
        double circumference = (2*(3.14*radius));
        return circumference;
    }



    private static int squarePerimeter (int length)
    {
        int perimeter = (4*length);
        return perimeter;
    }

    private static int squareArea (int length)
    {
        int area = 2 * length;
        return area;
    }

    private  static  int rectanglePerimeter (int length, int height)
    {
        int perimeter = ((2*length)+(2*height));
        return perimeter;
    }

    private static int rectangleArea (int length, int height)
    {
        int area = (length * height);
        return area;
    }





}







