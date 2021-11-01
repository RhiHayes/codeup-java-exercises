package movies;

import util.Input;

import java.util.Objects; //Importing objects because array items ARE objects. This
// was the missing piece for me after awhile. Once I got this I was on the right track.

import static movies.MoviesArray.findAll; //importing this allows access to movies

public class MoviesApplication {

    private static Movie[] moviesArray = findAll(); //Allows all movies to be called


    public static void one() { //Prints every movie item

        for (Movie movie : moviesArray) {
            System.out.println(movie.getName());
        }
    }


    public static void two() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getCategory(), "drama")) { //Prints every drama movie
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    public static void three() {
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getCategory(), "musical")) { //Prints every musical movie
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    public static void four() { //Prints every scifi movie
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getCategory(), "scifi")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    public static void five() { //Prints every horror movie
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getCategory(), "horror")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }


    public static void six() {  //Prints every comedy movie
        for (Movie movie : moviesArray) {
            if (Objects.equals(movie.getCategory(), "comedy")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {

        boolean confirmed; //declares boolean confirm
        do {
            Input input = new Input(); //Allows user input to be picked up

            System.out.print("0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the drama category \n" +
                    "3 - view all movies in the musical category \n" +
                    "4 - view all movies in the scifi category \n" +
                    "5 - view all movies in the horror category \n" +
                    "6 - view all movies in the comedy category \n"
            );
            System.out.print("What would you like to do? ");
            int userChoice = input.getInt(); //User's choice

            if (userChoice == 1) {
                one();
            } else if (userChoice == 2) {
               two();
            } else if (userChoice == 3) {
                three();
            } else if (userChoice == 4) {
                four();
            } else if (userChoice == 5) {
                five();
            } else if (userChoice == 6) {
                six();
            }


            input.getString(); //decides if user wants to continue or not
            System.out.print("Do you want to continue? [Y/N] ");
            String userConfirm = input.getString();
            confirmed = userConfirm.equalsIgnoreCase("y"); //confirm = y
        }

        while(confirmed); //Do everything inside of the do loop, while confirm





    }
}
