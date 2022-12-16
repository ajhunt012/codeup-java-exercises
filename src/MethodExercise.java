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
//                   Addition
//                   Subtraction
//                   Multiplication
//                   Division
//                   Each function needs to take two parameters/arguments so that the operation can be performed.
//
//                   Test your methods and verify the output.
//
//                   Add a modulus method that finds the modulus of two numbers.


    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static int remainder(int x, int y) {
        return x % y;
    }


//   2.  Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.


//    public static void main(String[] args) {
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);
//    }
//
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
        boolean continueFactoring = true;

        while (continueFactoring) {
            System.out.print("Enter an integer from 1 to 10: ");
            int number = getInteger(1, 10);
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
            System.out.print("Do you want to continue? (y/n) ");
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("n")) {
                continueFactoring = false;
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


//4.


//    5. Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"


//import java.util.Scanner;



//    public static int getInteger(int min, int max) {
//        System.out.println("Enter a number between " + min + " and " + max);
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//        userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        }
//        return getInteger(min, max);
//    }
//
//    public static long factorial() {
//        int NumToFactorialize = getInteger(1, 10);
//        long currentSum = 1;
//        for (int counter = 1; counter <= NumToFactorialize; counter++) {
//            currentSum *= counter;
//        }
//        boolean userChoice = cont();
//        if (userChoice) {
//            factorial();
//        }
//        return currentSum;
//    }
//
//    public static boolean cont() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("would you like to go again?");
//        String answer = scanner.nextLine();
//        if (answer.equals("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static int dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);
        return dice1 + dice2;
    }


}