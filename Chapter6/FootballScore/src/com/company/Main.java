package com.company;

public class Main
{

    public static void main(String[] args)
    {

        Score score = new Score();

        score.points = 0;

        score.completedFieldGoal();
        score.completedFieldGoal();
        score.completedTouchdown();
        System.out.println(score.points);


    }
}
