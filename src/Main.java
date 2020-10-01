import javax.swing.*;

/**
 * Created by Salah Abdinoor
 * 9/26/2020
 * 4:34 PM
 * HealthyPets
 * Copyright: MIT
 */
public class Main {

    /**
     * This Enum holds the animal names + the exit
     */
    public enum Names {SIXTEN, DOGGE, VENUS, OVE, HYPNO, EXIT}

    public static void main(String[] args) {

        RunProgram();
    }

    /**
     * Step 1: Create while-loop to keep program running until user(Diet coach) exits.
     * Step 2: Try/Catch to handle Errors
     * Step 3: Create objects from provided animals.
     * Step 4: Ask user to type the name of the animal for which he/she needs the diet-plan.
     * Step 5: Create instance of said input from enum-Names
     * Step 6: Using a switch/case, use "eatfood();" method for corresponding animal / exit program.
     */
    public static void RunProgram(){

        boolean flag = true;    // while flag = true -> running program.

        while (flag) {
            try {

                // Create the instances using polymorphism
                Animal sixten = new Dog("Sixten", 5);
                Animal dogge = new Dog("Dogge", 10);
                Animal venus = new Cat("Venus", 5);
                Animal ove = new Cat("Ove", 3);
                Animal hypno = new Snake("Hypno", 1);

                // Input
                String animal = JOptionPane.showInputDialog("Vad är namnet på djuret? \n('Exit' för att stänga programmet.)");

                // Create instance of Enum and takes value of input-string as "txt".
                Names names = Enum.valueOf(Names.class, animal.toUpperCase());

                // Switch case for the different scenarios.
                switch (names) {                            // Using said "object" as the operator.

                    case SIXTEN -> sixten.eatFood();        // If names == SIXTEN -> sixten.eatFood();

                    case DOGGE -> dogge.eatFood();

                    case VENUS -> venus.eatFood();

                    case OVE -> ove.eatFood();

                    case HYPNO -> hypno.eatFood();

                    case EXIT -> flag = false;              // Close program
                }

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Finns inget djur som heter så, försök igen.");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Stänger programmet.");
                break;
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Vikten får inte vara negativ.");
                break;
            }
        }
    }
}

