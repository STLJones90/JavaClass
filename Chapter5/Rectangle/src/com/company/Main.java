package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(getArea(10, 10));
        System.out.println(getParameter(2, 2));
    }

    public static int getArea(int height, int width)
    {
        int area = (height*width);
        int parameter = (height + width);
        return area;
    }

    public static int getParameter (int height, int width)
    {
        int parameter= (height + width);
        return  parameter;
    }
}
