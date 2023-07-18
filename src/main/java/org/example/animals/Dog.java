package org.example.animals;

public class Dog extends Animal{


    private static final String kindName = "Dog";

    private static final String moveType = "on foot";

    private Double tailLength;

    private String color;


    public Dog(String color,Integer age,Integer hungryLevel) {
        super(kindName, moveType,age,hungryLevel);
        this.color = color;

    }

    public Dog(Double tailLength,  String color, Integer age,Integer hungryLevel) {
        super(kindName, moveType,age,hungryLevel);
        this.tailLength = tailLength;
        this.color = color;
    }


    public String getColor(){
        return color;
    }

    public Double getTailLength(){
        return tailLength;
    }

}
