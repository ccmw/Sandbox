package modules.calcz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateSingles {
    private List<Float> decimalList = new ArrayList<>();
    private List<String> operatorList = new ArrayList<>();
    private Scanner reader = new Scanner(System.in);
    private float finalTotal;

    public CalculateSingles(float firstNumEntered) {
        boolean carryOn = false;
        decimalList.add(firstNumEntered);

        while (!carryOn) {
            if (decimalList.size() == 1) {
                GetOperator();
                GetANumber();
            } else {
                finalTotal = AttemptCalculation();
                System.out.println("Your total is currently: " + finalTotal);
                System.out.println("Would you like to add more numbers? Y/N");
                String response = reader.next();
                if (response.toUpperCase().equals("Y")) {
                    GetOperator();
                    GetANumber();
                } else if (response.toUpperCase().equals("N")) {
                    carryOn = true;
                    System.out.println();
                    System.out.println("Your total is: ");
                    System.out.println(finalTotal);
                    DisplayFinalEquation();
                } else {
                    System.out.println("That wasn't an option");
                }
            }
        }
    }

    private float AttemptCalculation() {
        float mathTotal = 0.0f;
        for (int f = 0; f < decimalList.size(); f++) {
            if (f == 0) {
                mathTotal = decimalList.get(f);
            } else {
                String s = operatorList.get(f - 1);
                try {
                    switch (s) {
                        case "+":
                            mathTotal = mathTotal + decimalList.get(f);
                            break;
                        case "-":
                            mathTotal = mathTotal - decimalList.get(f);
                            break;
                        case "*":
                            mathTotal = mathTotal * decimalList.get(f);
                            break;
                        case "/":
                            mathTotal = mathTotal / decimalList.get(f);
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println("Unable to compute: " + ex);
                }

            }
        }
        return mathTotal;
    }

    private void GetOperator() {
        boolean operatorValid = false;

        while (!operatorValid) {
            System.out.println("Enter an operator (+, -, *, /):");
            String holdOperator = reader.next();

            switch (holdOperator) {
                case "+":
                    operatorList.add(holdOperator);
                    operatorValid = true;
                    break;
                case "-":
                    operatorList.add("-");
                    operatorValid = true;
                    break;
                case "*":
                    operatorList.add("*");
                    operatorValid = true;
                    break;
                case "/":
                    operatorList.add("/");
                    operatorValid = true;
                    break;
                default:
                    System.out.println("That isn't a valid operator, please try again.");
                    break;
            }
        }
    }

    private void TestNumber(String incomingInput) {
        //Test for a number
        try {
            float holdFloat;
            holdFloat = Float.parseFloat(incomingInput);
            decimalList.add(holdFloat);
        } catch (NumberFormatException NotInteger) {
            System.out.println("Something went wrong");
        }
    }

    private void GetANumber() {
        System.out.println("Please enter another number:");
        String secondInputHold = reader.next();
        TestNumber(secondInputHold);
    }

    private void DisplayFinalEquation() {
        String finalEquation = "";

        for (int f = 0; f < decimalList.size(); f++) {
            if (f == 0) {
                finalEquation = finalEquation + "(";
            }

            finalEquation = finalEquation + decimalList.get(f);

            if (f < operatorList.size()) {
                String s = operatorList.get(f);
                finalEquation = finalEquation + " " + s + " ";
            } else {
                finalEquation = finalEquation + ")";
            }
        }
        System.out.println();
        System.out.println("Your final equation is:");
        System.out.println(finalEquation + " = " + finalTotal);
        System.out.println();
    }
}
