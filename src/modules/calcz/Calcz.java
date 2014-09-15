package modules.calcz;

import java.util.Scanner;

public class Calcz {

    public Calcz() {
        Scanner reader = new Scanner(System.in);
        System.out.println("You chose the calculator.");
        System.out.println("Please enter a number or equation:");
        String inputHold = reader.nextLine();
        TestNumber(inputHold);
    }

    private void TestNumber(String incomingInput) {
        //Test for a number
        try {
            float holdFloat;
            holdFloat = Float.parseFloat(incomingInput);
            CalculateSingles calcSingle = new CalculateSingles(holdFloat);
        } catch (NumberFormatException NotInteger) {
            CalculateEquation calcEquation = new CalculateEquation();
        }
    }
}
