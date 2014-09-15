package modules.speedmath;

import java.util.Random;
import java.util.Scanner;

public class Speedmath {
    private Scanner reader = new Scanner(System.in);
    private long startTime;
    private boolean exitSignal = false;
    private int userScore;
    private Random randomGenerator = new Random();

    public Speedmath() {
        String userInput = "";
        boolean readyToBegin = false;

        System.out.println("Welcome to Speedmath; a wimpy math game");
        System.out.println("The rules are simple:");
        System.out.println("\t 1. Answer as fast as you can.");
        System.out.println("\t 2. Type exit to go back to tool selection");
        System.out.println("Are you ready to begin? Y/N");

        while (!readyToBegin) {
            userInput = reader.next();
            if (userInput.toUpperCase().equals("Y")) {
                StartGame();
                System.out.println();
                readyToBegin = true;
            } else if (userInput.toUpperCase().equals("N")) {
                System.out.println("Going back to the tools selection menu!");
                readyToBegin = true;
            } else {
                System.out.println("That isn't a valid response");
            }
        }
    }

    private void StartGame() {
        float number1 = 0.0f, number2 = 0.0f, result = 0.0f;
        String signOperator = "", userAnswer = "";

        startTime = System.currentTimeMillis();
        userScore = 0;

        while (!exitSignal) {
            signOperator = GetAnOperator();
            number1 = GetANumber(signOperator);
            number2 = GetANumber(signOperator);
            result = GetResult(number1, signOperator, number2);

            System.out.println();
            System.out.println("" + ((System.currentTimeMillis() - startTime) / 1000) + " seconds have elapsed \t Score: " + userScore);
            System.out.println("\t" + number1);
            System.out.println("\t" + signOperator);
            System.out.println("\t" + number2);
            System.out.println("  ________");
            userAnswer = reader.next();

            if (!userAnswer.toUpperCase().equals("EXIT")) {
                try {
                    if (Float.parseFloat(userAnswer) == result) {
                        userScore++;
                    } else {
                        System.out.println("Incorrect, the correct answer was: " + result);
                        System.out.println();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect, the correct answer was: " + result);
                }
            } else if (userAnswer.toUpperCase().equals("EXIT")) {
                System.out.println("You finished after " + ((System.currentTimeMillis() - startTime) / 1000) + " seconds with a score of: " + userScore);
                System.out.println("Thank you for playing!");
                System.out.println();
                exitSignal = true;
            }

        }
    }

    private int GetANumber(String sign) {
        int tempNumber;
        switch (sign) {
            case "+":
                tempNumber = randomGenerator.nextInt(100);
                break;
            case "-":
                tempNumber = randomGenerator.nextInt(100);
                break;
            case "*":
                tempNumber = randomGenerator.nextInt(50);
                break;
            case "/":
                tempNumber = randomGenerator.nextInt(9) + 1;
                break;
            default:
                tempNumber = 0;
                System.out.println("An error has occurred");
                break;
        }
        return tempNumber;
    }

    private String GetAnOperator() {
        String operators[] = {"+", "-", "*", "/"};
        String randOperator = operators[new Random().nextInt(operators.length)];
        return randOperator;
    }

    private float GetResult(float i, String s, float i2) {
        float tempResult = 0.0f;
        switch (s) {
            case "+":
                tempResult = i + i2;
                break;
            case "-":
                tempResult = i - i2;
                break;
            case "*":
                tempResult = i * i2;
                break;
            case "/":
                try {
                    tempResult = i / i2;
                } catch (NumberFormatException ex) {
                    tempResult = 0.0f;
                    System.out.println("An error has occurred");
                }
                break;
            default:
                tempResult = 0.0f;
                System.out.println("An error has occurred");
                break;
        }
        return tempResult;
    }
}
