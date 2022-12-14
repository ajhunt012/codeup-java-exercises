import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. %n", pi);
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Please enter a number: ");
////        int userInput = scanner.nextInt();
//
        Scanner scanner1 = new Scanner(System.in);
////        Scanner scanner2 = new Scanner(System.in);
////        Scanner scanner3 = new Scanner(System.in);
//
//        System.out.println("Please enter 3 words: ");
//
//        String word1 = scanner1.next();
//        String word2 = scanner1.next();
//        String word3 = scanner1.next();
//
//        System.out.printf("%s %n %s %n %s", word1, word2, word3);
//        System.out.println("");
//        scanner1.nextLine();
//
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner1.nextLine();
//        System.out.printf("your sentence is: %s %n", userSentence);

//        System.out.println("Enter the length of the room: ");
//        String lengthInput = scanner1.nextLine();

//        System.out.println("Enter the width of the room: ");
//        String widthInput = scanner1.nextLine();

        //bonus using delimeter
        System.out.println("Enter the length and width of the room: ");
        String widthInput = scanner1.nextLine();
        scanner1.useDelimiter("\n");
        float userBonusLength = scanner1.nextFloat();

        System.out.printf("length: %s  and width: %s %n", userBonusLength, widthInput);

//        int length =  Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);

        //bonus
//        float length =  Float.parseFloat(lengthInput);
        float width = Float.parseFloat(widthInput);

//        int area = width*length;
//        int perimeter = (length*2) + (width*2);

        float area = width*userBonusLength;
        float perimeter = (userBonusLength*2) + (width*2);
        //assuming the wall are 12 ft in height
        float volume = (userBonusLength*width*12);

        //area length* width
        System.out.printf("Area of the room: %s %n", area);

        //perimeter 2*length + 2*width
        System.out.printf("Perimeter of the room: %s %n", perimeter);

        //bonus: calculate the volume of the room
        System.out.printf("Perimeter of the room: %s %n", volume);
















    }


};