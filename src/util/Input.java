package util;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("si");
    }

    public static int getInt(int min, int max) {
        while (true) {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            String input = Input.getString();
            try {
                int userNumber = Integer.valueOf(input);
                if (userNumber >= min && userNumber <= max) {
                    return userNumber;
                } else {
                    System.out.println("Number/numbers was/were outside of specified range, Please enter a number within the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            }
        }
    }
    public static int getInt(){
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max) {
        while (true) {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            String input = Input.getString();
            try {
                double userNumber = Double.valueOf(input);
                if (Double.compare(userNumber, min) >= 0 && Double.compare(userNumber, max) <= 0) {
                    return userNumber;
                } else {
                    System.out.println("Number/numbers was/were outside of specified range, Please enter a number within the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a double.");
            }
        }
    }
    public static double getDouble() {
        return getDouble(Double.MIN_VALUE, Double.MAX_VALUE);
    }

    public static int getBinary(String prompt) {
        System.out.print(prompt);
        String input = Input.getString();
        try {
            return Integer.valueOf(input, 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a binary number.");
            return getBinary(prompt);
        }
    }

    public static int getHex(String prompt) {
        System.out.print(prompt);
        String input = Input.getString();
        try {
            return Integer.valueOf(input, 16);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a hexadecimal number.");
            return getHex(prompt);
        }
    }

//    call either of these two with the following code.
//
//    int binary = getBinary("Enter a binary number: ");
//System.out.println("Your number is " + binary);
//
//    int hex = getHex("Enter a hexadecimal number: ");
//System.out.println("Your number is " + hex);



}