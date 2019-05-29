package com.company;


public class Car
{
    private int passengerCount;

    public Car(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }


    public int setPassengerCount()
    {
        return passengerCount;
    }


    public String getPassengerCount()
    {
        String passengerCount1 = Integer.toString(passengerCount);

        if (passengerCount > 0)
        {
            return passengerCount1;
        }


        else
        {
            String notValid = ("not valid passenger count");
            return notValid;
        }
    }


}
