import java.util.Scanner;

public class MethodExercise {

//    public static void main(String[] args) {
//        System.out.println(addition(9, 3));
//        System.out.println(subtract(9, 3));
//        System.out.println(multiply(9, 3));
//        System.out.println(divide(9, 3));
//        System.out.println(remainder(10, 3));
//
//    }

    //        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//                Subtraction
//        Multiplication
//                Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//                Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.
    public static int addition(int x, int y) {
        return x + y;
    }


    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int remainder(int x, int y) {
        return x % y;
    }



//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        int userInput = 0;
//        boolean validInput = false;
//
//        while (!validInput) {
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
//            try {
//                userInput = scanner.nextInt();
//                if (userInput >= min && userInput <= max) {
//                    validInput = true;
//                } else {
//                    System.out.println("That is not a number between 1 and 10, try again.");
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid input. Please try again.");
//                scanner.nextInt();
//            }
//        }
//        return userInput;
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);
//    }


//    3. Calculate the factorial of a number.
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String userInput;
            boolean continueCalculating = true;

            while (continueCalculating) {
                // Prompt the user to enter an integer from 1 to 10
                System.out.print("Enter an integer from 1 to 10: ");
                int number = getInteger(1, 10);

                // Calculate the factorial of the number using a for loop
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                System.out.println("The factorial of " + number + " is: " + factorial);

                // Ask if the user wants to continue
                System.out.print("Do you want to continue? (y/n) ");
                userInput = scanner.next();

                if (userInput.equalsIgnoreCase("n")) {
                    continueCalculating = false;
                }
            }
        }

        public static int getInteger(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int userInput = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    userInput = scanner.nextInt();
                    if (userInput >= min && userInput <= max) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid, try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid, try again.");
                    scanner.next();
                }
            }
            return userInput;
        }






}