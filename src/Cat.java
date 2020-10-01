import javax.swing.*;

/**
 * Created by Salah Abdinoor
 * 9/26/2020
 * 4:34 PM
 * HealthyPets
 * Copyright: MIT
 */

/**
 * This class is used by the cats
 * It extends 'Animal' and implements 'eat'
 * It overrides the "eatFood()" method to complement cats.
 */
public class Cat extends Animal{

    private int catFood;

    // Constructor with super from 'Animal'
    public Cat(String name, int weight) {
        super(name, weight);
    }


    @Override
    public void eatFood() {
        // Calculates food intake per weight for cat.
        catFood = (getWeight() * 1000) / 150;

        JOptionPane.showMessageDialog(null, getName() + " behöver äta "
                + catFood + " gram av kattfoder" );
    }
}
