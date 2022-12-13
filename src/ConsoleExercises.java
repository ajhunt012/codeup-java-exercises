import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately, %s", pi);


        Scanner scanner = new Scanner(System.in);
//        Explore the Scanner Class.
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.println("Enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//        System.out.println(userInput);


//        What happens if you input something that is not an integer?
//        It doesn't work!

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println(userInput1 + userInput2 + userInput3);





//                What happens if you enter less than 3 words?
//        System will wait for third word to be entered.

//                What happens if you enter more than 3 words?
//        Only the three words asked for were input.


//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("Enter a new sentence: ");
//        String userSentence = scanner.next();
//        System.out.println(userSentence);


//        do you capture all the words?
//                Rewrite the above example using the nextLine method.

//        System.out.println("Enter a new sentence: ");
//        String userSentence2 = scanner.nextLine();
//        System.out.println(userSentence2);

//                Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

        System.out.println("Enter the length and width of the codeup classroom. ");
        int userWidth1 = scanner.nextInt();
        int userLength2 = scanner.nextInt();

        System.out.println(userWidth1*userLength2 + " is the area of the room.");

//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.

//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.

//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.



    }
}
