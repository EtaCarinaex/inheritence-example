package org.example;

import org.example.animals.Animal;
import org.example.animals.Dog;
import org.example.animals.Dolphin;
import org.example.animals.Eagle;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        Eagle eagle = new Eagle(185);

        Double wingLengthToMeter = eagle.wingLengthToMeter();

        System.out.println(eagle.getKindName() + " wingLength -> " + wingLengthToMeter);


        Dog dog = new Dog("Red", 12, 12);


        Dolphin dolphin = new Dolphin();

        Main main = new Main();


        // Hayvan listesi
        List<Animal> animalList = new ArrayList<>();

        animalList.add(dog);

        animalList.add(dolphin);

        animalList.add(eagle);


        // hayvan listesi son


        for (Animal animal : animalList) {

            Boolean isAnimalHungry = main.checkIsAnimalHungry(animal);

            System.out.println(String.format("%s  is hungry -> %b", animal.getKindName(), isAnimalHungry));


        }

    }


    public Boolean checkIsAnimalHungry(Animal animal) throws IllegalAccessException {

        if (animal.getHungryLevel() < 0 || animal.getHungryLevel() > 100)
            throw new IllegalAccessException("This animal will be dead");

        return !(animal.getHungryLevel() >= 50 && animal.getHungryLevel() <= 100);
    }


}


/*
          Animal
               -Dog
               -Dolphing
               -Eagle
 */


