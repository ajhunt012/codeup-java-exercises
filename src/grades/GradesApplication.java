package grades;

import java.util.HashMap;
import java.util.Scanner;

import util.Input;


public class GradesApplication {
    public static void studentInformation(HashMap<String, Student> students) {
        System.out.println("Welcome <insert teacher name here>! \nHere are our current student's GitHub usernames: ");
        System.out.print("| ");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        String answer;
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String studentRequest = Input.getString();
            if (students.containsKey(studentRequest)) {
                System.out.println("Name: " + students.get(studentRequest).getName() + " | GitHub: " + studentRequest + " | Grade Average: " + students.get(studentRequest).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the github username %s.", studentRequest);
            }
            System.out.println("Would you like to search for another student? (y/n)");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        } while (answer.equals("y"));
        System.out.println("Have a nice day.");
    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student Josh = new Student("Josh");
        Josh.addGrade(89);
        Josh.addGrade(100);
        Josh.addGrade(50);
        students.put("Josh01", Josh);

        Student Jim = new Student("Jim");
        Jim.addGrade(98);
        Jim.addGrade(71);
        Jim.addGrade(80);
        students.put("Jim01", Jim);

        Student Jack = new Student("Jack");
        Jack.addGrade(53);
        Jack.addGrade(100);
        Jack.addGrade(69);
        students.put("Jack01", Jack);

        Student Jag = new Student("Jag");
        Jag.addGrade(100);
        Jag.addGrade(99);
        Jag.addGrade(98);
        students.put("Mr.Jag", Jag);

        studentInformation(students);
    }
}