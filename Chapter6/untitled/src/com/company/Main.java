package com.company;

public class Main
{

    public static void main(String[] args)
    {

        Triangle triangle1 = new Triangle();

        triangle1.setSideA(4);
        triangle1.setSideB(4);
        triangle1.setSideC(4);

        Triangle triangle2 = new Triangle();

        triangle2.setSideA(4);
        triangle2.setSideB(5);
        triangle2.setSideC(8);

        printTriangleSummary(triangle1);
        printTriangleSummary(triangle2);
    }

    private static void printTriangleSummary(Triangle triangle)
    {
        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Side C: " + triangle.getSideC());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("equilateral?: " + triangle.isEquilateral());
        System.out.println("Isosceles? " + triangle.isIsosceles());
        System.out.println("Scalene?: " + triangle.isScalene());
        System.out.println("Right triangle?: " + triangle.isRightAngle());
        System.out.println("Acute triangle?: " + triangle.isAcute());
        System.out.println("Obtuse triangle?: " + triangle.isObtuse());



    }

}