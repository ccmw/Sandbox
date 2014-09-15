import modules.bbcalculator.Calculator;
import modules.calcz.Calcz;
import modules.speedmath.Speedmath;

import java.util.Scanner;

public class DecisionModule {
    public DecisionModule() {
        Scanner reader = new Scanner(System.in);
        boolean allDone = false;
        final String[] DECISIONCHOICES = {
                "A) MW-Calcz", "B) BB-Calculator", "C) MW-Sp33dm4th", "Exit"};
        String choiceMade;

        while (!allDone) {
            System.out.println("Which tool would you like to use?");

            for (String i : DECISIONCHOICES) {
                System.out.println("\t" + i);
            }
            System.out.println("_________________________________________");

            choiceMade = reader.next();
            switch (choiceMade.toUpperCase()) {
                case "A":
                    Calcz calculatorModule = new Calcz();
                    break;
                case "B":
                    Calculator bbcalculatorModule = new Calculator();
                    break;
                case "C":
                    Speedmath speedmathModule = new Speedmath();
                    break;
                case "EXIT":
                    allDone = true;
                    break;
                default:
                    System.out.println("Something went wrong, try again.");
                    break;
            }
        }
        System.out.println("Thank you for using the Sandbox!");
    }
}
