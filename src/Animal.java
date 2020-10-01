/**
 * Created by Salah Abdinoor
 * 9/28/2020
 * 2:22 PM
 * HealthyPets
 * Copyright: MIT
 */

/**
 * This Absract-class is inhearited by subclasses
 * It holds animals "name" and "weight" as variables and corresponding getter-methods.
 * It implements the "eatFood()" method from the interface 'Eat'.
 */
abstract class Animal implements Eat {

    private String name;
    private int weight;

    // Constructor
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = setWeight(weight);
    }

    // Makes sure that weight isn't negative.
    public int setWeight(int weight) {
        if (weight >= 0){
            this.weight = weight;
            return weight;
        } else throw new ArithmeticException("Vikten får inte vara negativ.");
    }

    public int getWeight(){
            return weight;
    }

    public String getName(){
        return name;
    }

}
