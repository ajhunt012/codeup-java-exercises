import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("You're having a conversation with Bob, what would you like to say or ask? ");
        String userInput = sc.nextLine();

        if(userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if(userInput.endsWith("!")) {
            System.out.println("Whoa, Chill out!");
        }    else if(userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
