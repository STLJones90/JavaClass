package com.company;

public class SpaceShip
{
    private String shipName;
    private int passengerCount=0;
    public String shipDescription = Integer.toString(passengerCount);

    public SpaceShip(String shipName)
    {
        this.shipName = shipName;
    }

    public void addPassenger()
    {
        passengerCount++;
    }

    public void removePassenger()
    {
        passengerCount--;
    }

    public void removeAllPassengers()
    {
        passengerCount=0;
    }

    public String getShipDescription()
    {
        return shipName +" "+ passengerCount;
    }
}
