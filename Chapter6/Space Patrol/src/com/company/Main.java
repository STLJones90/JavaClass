package com.company;

public class Main
{

    public static void main(String[] args)
    {

        SpaceShip spaceShip = new SpaceShip("USS Callister");




        spaceShip.addPassenger();

        System.out.println(spaceShip.getShipDescription());




        spaceShip.removeAllPassengers();

        System.out.println(spaceShip.getShipDescription());




    }
}
