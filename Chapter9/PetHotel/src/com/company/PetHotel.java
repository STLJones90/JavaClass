package com.company;


import java.util.HashSet;

import java.util.TreeMap;


public class PetHotel
{
    java.util.Scanner userInput = new java.util.Scanner(System.in);
    java.util.Random roomNumber = new java.util.Random();
    TreeMap<Integer, String> theHotel = new TreeMap<>();
    boolean keepRunning = true;


    public void run()
    {
        System.out.println("Hello, welcome to the Pet Hotel");
        subMenu();
        while (keepRunning)
        {
            switch (userInput.next().toUpperCase())
            {
                case "CI":
                {
                    checkIn();
                    break;
                }
                case "CO":
                {
                    checkOut();
                    break;
                }
                case "M":
                {
                    move();
                    break;
                }
                case "V":
                {
                    occupants();
                    break;
                }
                case "O":
                {
                    availableRooms();
                    break;
                }
                case "S":
                {
                    subMenu();
                    break;
                }
                case "E":
                {
                    System.out.println("bye bye");
                    keepRunning = false;
                }
            }
        }
    }

    public void checkIn()
    {
        System.out.println("enter in your pet's name");
        String petName = userInput.next();
        int room = roomNumber.nextInt(20) + 1;
        theHotel.put(room, petName);
        System.out.println(petName + " is checked in and in room: " + room + "\n");
    }

    public void checkOut()
    {
        System.out.println("what room was your pet in");
        int petRoomNumber = userInput.nextInt();
        if (!theHotel.containsKey(petRoomNumber))
        {
            System.out.println("there is not a pet in that room");
        }
        else
        {
            System.out.println("O.K. " + theHotel.get(petRoomNumber) + " is checked out!");
            theHotel.remove(petRoomNumber);
        }
    }

    public void move()
    {
        System.out.println("enter your pet's room number");
        int roomChange = userInput.nextInt();
        theHotel.remove(roomChange);
        System.out.println("Enter your pet's name");
        String petName = userInput.next();
        int newRoom = roomNumber.nextInt(20)+1;
        theHotel.put(newRoom, petName);
        System.out.println("OK, we will move your pet to room: " + newRoom);
    }

    public void occupants()
    {
        System.out.println(theHotel);
    }

    public void rooms()
    {
        int count = 0;
        while (count < 20)
        {
            if (theHotel.containsKey(count))
            {
                System.out.println(theHotel.get(count) + " is in room " + count + "\n");
            }
            count++;
        }

    }

    public void availableRooms()
    {
        int count = 0;
        while (count < 20)
        {
            if (!theHotel.containsKey(count))
            {
                System.out.println("room: " + count + " is available");
            }
            count++;
        }
    }

    public void subMenu()
    {
        System.out.println("  MAIN MENU ");
        System.out.println("=============");
        System.out.println("\'CI\'- Check in\n\'CO\'- Check Out\n\'M\'- Move Rooms\n\'V\'- View Occupants\n\'O\'- View Occupancy\n\'E\'- Exit");
        System.out.println("\'S\'- menu");
    }

}
