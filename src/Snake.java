import javax.swing.*;

/**
 * Created by Salah Abdinoor
 * 9/26/2020
 * 4:34 PM
 * HealthyPets
 * Copyright: MIT
 */

/**
 * This class is used by the snakes
 * It extends 'Animal' and implements 'eat'
 * It overrides the "eatFood()" method to complement snakes.
 */
public class Snake extends Animal {

    // "snakePellets" are ALWAYS 20g independent of the weight of the snake
    private final int snakePellets = 20;

    // Constructor with super from 'Animal'
    public Snake(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eatFood() {

        // prints food intake for snake.
        JOptionPane.showMessageDialog(null,getName() + " behöver äta " +
                snakePellets + " gram av ormpellets.");

    }


}
