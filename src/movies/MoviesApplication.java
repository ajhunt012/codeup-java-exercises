package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    public static void getMovieInfo(Movie movie){
        System.out.println("Movie Name: " + movie.getName() + " | Movie Category: " + movie.getCategory());
    }
    public static void searchMovies(String genre) {
        if (genre.equals("all")) {
            for (Movie movie : MoviesArray.findAll()) {
                getMovieInfo(movie);
            }
            goAgain();
        } else {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals(genre)) {
                    getMovieInfo(movie);
                }
            }
            goAgain();
        }
    }

    public static void goAgain() {
        System.out.println("***********************\nSearch more movies? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            movieApplication();
        } else {
            System.out.println("Have a nice day.");
        }
    }

    public static void movieApplication(){
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        int userInput = Input.getInt();
        if (userInput == 1) {
            searchMovies("all");
        } else if (userInput == 2) {
            searchMovies("animated");
        } else if (userInput == 3) {
            searchMovies("drama");
        } else if (userInput == 4) {
            searchMovies("horror");
        } else if (userInput == 5) {
            searchMovies("scifi");
        } else {
            System.out.println("Have a nice day.");
        }
    }

    public static void main(String[] args) {
        movieApplication();
    }
}
