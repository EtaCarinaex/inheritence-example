package org.example.animals;

public class Dolphin extends Animal {


    private Integer bodyLength;


    public Dolphin() {
        super("Dolphin", "Swimming",14,95);
    }

    public Dolphin(Integer age) {
        super("Dolphin", "Swimming",age,100);

    }


    public Integer getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(Integer bodyLength) {
        this.bodyLength = bodyLength;
    }

}
