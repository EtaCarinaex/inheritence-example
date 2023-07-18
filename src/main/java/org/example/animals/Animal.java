package org.example.animals;

public class Animal{

    private String kindName;

    private String moveType;

    private Integer age;

    private Integer hungrylevel;





    public Animal(String kindName, String moveType,Integer age, Integer hungrylevel) {
        this.kindName = kindName;
        this.moveType = moveType;
        this.age = age;
        this.hungrylevel = hungrylevel;
    }


    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }


    public Integer getHungryLevel(){
        return hungrylevel;
    }

    public void setHungrylevel(Integer hungryLevel){
        this.hungrylevel = hungrylevel;
    }

}
