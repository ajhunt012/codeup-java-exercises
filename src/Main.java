import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Hello, World!");


        //main method shortcut
        //main(tab)
        //psvm(tab/enter)
//        public static void main(String[] args) {
//

//    System.out.println shortcut
//            sout

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);


//
        Scanner scanner = new Scanner(System.in);  // scanner object

        System.out.print("Enter something: ");
        String userInput = scanner.next();  //reads the next item from the console.

        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        Salutations, codeup!Enter something: Dude
//        You entered: --> "Dude" <--

        System.out.println("Enter something: ");
        String userInput2 = scanner.nextLine();  // will return the whole next line. if you're using the previous function it will take away the first word.

        System.out.println("You entered: --> \"" + userInput2 + "\" <--");





    }
}
