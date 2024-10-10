package org.example;

import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    Chicken chicken = new Chicken("Marvin", 3, 15);

    Cat cat = new Cat("Findus", 15, 5.5);

    Pig pig = new Pig("Fridolin", 7, 55.8);

    Cow cow = new Cow("Klaus", 3, 140.6);



    List<String> animalsNameList = new ArrayList<>();

    List<FarmAnimal> animalsList = new ArrayList<>();

    List<FarmAnimal> hungryAnimals = new ArrayList<>();

    public Farm(){
        nameListAnimals();
        listAnimals();
    }

    public void nameListAnimals (){

        animalsNameList.add(cow.getName());
        animalsNameList.add(cat.getName());
        animalsNameList.add(chicken.getName());
        animalsNameList.add(pig.getName());


    }


    public void listAnimals() {
        animalsList.add(cow);
        animalsList.add(cat);
        animalsList.add(chicken);
        animalsList.add(pig);
    }


    public void addingHungryAnimals() {
        for (FarmAnimal farmAnimal : animalsList) {
            if (farmAnimal.getHungry() == true) {
                hungryAnimals.add(farmAnimal);
            }
        }
    }

    public void feedingAllAnimals(){
        for (FarmAnimal hungryAnimal : hungryAnimals) {
            hungryAnimal.setHungry(false);
        }
    }

    public List<String> getAnimalsNameList() {
        return animalsNameList;
    }
}









