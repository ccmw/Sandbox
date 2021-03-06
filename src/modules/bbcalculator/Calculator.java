package modules.bbcalculator;

import java.util.Scanner;

public class Calculator {

    public Calculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        try {
            int number1 = input.nextInt();
        } catch (Exception ex) {
            System.err.println("not a number");
        }
        System.out.println("Enter second number");
        try {
            int number2 = input.nextInt();
        } catch (Exception ex) {
            System.err.println("not a number");
        }
        System.out.println("Enter operation: +,-,*,/,^");
        String operation = input.next();
        char a, b, c;
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int output;

        switch (operation) {
            case "+":
                output = number1 + number2;
                System.out.println("Sum of " + number1 + " and " + number2 + " is: " + output);
                break;
            case "-":
                output = number1 - number2;
                System.out.println("Subtraction of " + number2 + " from " + number1 + " is: " + output);
                //do something else
                break;
            case "*":
                output = number1 * number2;
                System.out.println("Product of " + number1 + " and " + number2 + " is: " + output);
                //do something else
                break;
            case "/":
                output = number1 / number2;
                System.out.println("Division of " + number1 + " by " + number2 + " is: " + output);
                try {
                    output = number1 / number2;
                } catch (Exception ex) {
                    System.err.println("logic error");
                }
            default:
                //if everything fails
                break;
        }

    }
}
