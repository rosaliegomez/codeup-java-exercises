package movies;
import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Input input = new Input();
        do {

            System.out.println("What would you like to do?");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - Add a new movie");

            int selection = input.getIntWithinRange("Enter your choice:", 1, 6);
            getCategoryFromUser(selection);


        } while (input.yesNo("Would you like to continue? Y/N"));
        System.out.println("Goodbye");
    }

    public static void getCategoryFromUser(int selection){
        switch(selection){
            case (1):
                showMovieNameAndCategory("all");
                break;
            case (2):
                showMovieNameAndCategory("animated");
                break;
            case (3):
                showMovieNameAndCategory("drama");
                break;
            case (4):
                showMovieNameAndCategory("horror");
                break;
            case (5):
                showMovieNameAndCategory("scifi");
                break;
            case (0):
                break;
            default:
                break;
        }
    }

    public static void showMovieNameAndCategory(String category) {

        Movie[] movies = MoviesArray.findAll();

        System.out.println("Here is a list of " + category + " movies:");

        for(Movie movie: movies){
            if(movie.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all")){
                System.out.println(movie.getName() + "-" + movie.getCategory());
            }
        }
    }

    public static void addNewMovie(String name, String category){
        System.out.println("Add new movie and its category:");
        Scanner scan = new Scanner(System.in);
        String newMovieName = scan.nextLine();
        String newCategoryName = scan.nextLine();


    }
}
