package org.example;

import animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Farm farm = new Farm();



        Scanner scanner = new Scanner(System.in);
        String input = "";
        double inputWeight;
        int inputAge;



//A Menu loop starts giving you options to type in to get different responses

        do {
            System.out.println("Type 1 to show a list of your farm animals. \nType 2 to interact with them! \n" +
                    "Type 3 to feed your animals.\nType 4 to create new animals.");
            input = scanner.next();

            // the first menu option is a name list of all farmanimals
            if (input.equals("1")) {
                System.out.println(farm.animalsNameList);
            }

//second option is to interact with the farmanimals

            if (input.equals("2")) {
                do{
//another loop to be able to return to your animals after interacting.

                System.out.println("Your animals are waiting for you..! \n Type milk to milk " +
                        "your cow. \n Type gather to gather your chickens eggs. \n Type play to play " +
                        "with your cat. \n Type check to look after your pig.");

                input = scanner.next();

                switch (input) {
                    case "milk" -> {
                        System.out.println(farm.cow.milk());
                    }
                    case "gather" -> {
                        System.out.println(farm.chicken.gatherEggs());
                    }
                    case "play" -> {
                        System.out.println(farm.cat.play());
                    }
                    case "check" -> {
                        System.out.println(farm.pig.checkIfSleeping());
                    }
                }
                System.out.println("If you want to to stay with your animals type ''stay'' or type ''l'' to leave.");
                    input = scanner.next();
                }while (input.equals("stay"));
            }
//third option to check if the animals are hungry and to feed the animals.

            if (input.equals("3")) {
                farm.addingHungryAnimals();

                if (farm.hungryAnimals.size() == 0) {
                    System.out.println("All of your animals are happy and full, no need to feed.");
                }
                else {
                    System.out.println("Some of your animals are hungry.. press 1 to feed them.");
                    input = scanner.next();
                    if (input.equals("1")) {
                        farm.feedingAllAnimals();
                        System.out.println("Good job, they have been fed!");
                    } else {
                        System.out.println("Please only type the given responses.");
                    }
                }





            }

            if (input.equals("4")) {
                System.out.println("Type 1 to add a new cow.\nType 2 to add a new pig.\nType 3 to add a new cat.\nType 4 to add a new chicken.");
                input = scanner.next();
                if (input.equals("1")) {
                    System.out.println("Alright, type in the name.");
                    input = scanner.next();
                    System.out.println("The name of the cow is " + input + ", now type the age in numbers not letters, you want it to be.");
                    inputAge = scanner.nextInt();
                    System.out.println("The cow " + input + " is " + inputAge + " years old. Finally, you can now type in the wanted weight.");
                    inputWeight = scanner.nextDouble();
                    System.out.println("Good Job, " + input + " is " + inputAge + " years old and weights " + inputWeight + ".");
                    Cow cow1 = new Cow(input, inputAge, inputWeight);
                    farm.getAnimalsNameList().add(cow1.getName());
                }
            }

            System.out.println("Type quit to exit or menu to return to the menu.");
            input = scanner.next();
            }while (input.equals("menu"));



}  }