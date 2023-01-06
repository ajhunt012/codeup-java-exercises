package movies;

import java.util.Scanner;

public class MoviesApplication {
    private static final Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.print("Enter your choice: ");

//        int choice = Input.getInt(scanner);
//        while (choice != 0) {
//            switch (choice) {
//                case 1:
//
//                    viewMovies();
//                    break;
//                case 2:
//                    viewMoviesByCategory("animated");
//                    break;
//                case 3:
//
//            }
//        }
    }
}