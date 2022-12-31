package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }


    public Student(){
        name = "";
        age = 0;
        averageScore = 0.00;
    }


}
