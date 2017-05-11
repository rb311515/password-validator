package com.acme.csci3130;

/**
 * Created by Rob on 5/10/2017.
 */

public class Chicken {


    String name;
    int age;
    String breed;

    int numOfEggsLayed;

    public Chicken(String name,int age, int b)
    {
        this.name=name;
        this.age=age;

        if(b==1)
            breed = ("Rhode Island Red");
        else
            if(b==2)
            breed = ("Silky");
        else
            if(b==3)
            breed = ("Leghorn");
        else
            breed= ("Unknown");



    }



    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void layEgg()
    {
        numOfEggsLayed++;

    }

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public int getNumOfEggsLayed()
    {
        return numOfEggsLayed;
    }

}
