import javax.swing.*;

/**
 * Created by Salah Abdinoor
 * 9/26/2020
 * 4:34 PM
 * HealthyPets
 * Copyright: MIT
 */

/**
 * This class is used by the dogs
 * It extends 'Animal' and implements 'eat'
 * It overrides the "eatFood()" method to complement dogs.
 */
public class Dog extends Animal{

    private int dogFood;

    // Constructor with super from 'Animal'
    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eatFood() {
        // Calculates food intake per weight for dog.
       dogFood = (getWeight() * 1000) / 100;

       JOptionPane.showMessageDialog(null,getName() + " behöver äta "
               + dogFood + " gram av hundfoder");

    }
}
