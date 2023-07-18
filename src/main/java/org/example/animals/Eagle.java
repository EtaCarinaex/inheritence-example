package org.example.animals;

public class Eagle extends Animal {

    private Integer wingLengthCm;


    public Eagle(String kindName, String moveType, Integer age, Integer hungryLevel) {
        super(kindName, moveType, age,hungryLevel);
    }


    public Eagle(Integer wingLengthCm) {
        super("EAGLE", "FLYING", 32,25);
        this.wingLengthCm = wingLengthCm;
    }


    public Double wingLengthToMeter() throws IllegalAccessException {

        if (wingLengthCm == null)
            throw new IllegalAccessException("Wing length cannot be null.");

        return  ((double)wingLengthCm / 100d);
    }


}
