//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("MuslimImpossible", 90, "PG", "Talha Kalif");
        Movie movie1 = new Movie("Lion King", 95, "PG 13", "T");

        movie.displayMovie();
        movie1.displayMovie();
    }
}
 /*  System.out.println("Movie details: ");
        System.out.println("Movie Title: " + movie.movieTitle);
        System.out.println("Movie Length: " + movie.movieLengthInMinutes + " minutes");
        System.out.println("Movie Rating: " + movie.rating);
        System.out.println("Movie Director: " + movie.director);
        System.out.println("" ); */

        /*
        System.out.println(" ");
        System.out.println("Movie details: ");
        System.out.println("Movie Title: " + movie1.movieTitle);
        System.out.println("Movie Length: " + movie1.movieLengthInMinutes + " minutes");
        System.out.println("Movie Rating: " + movie1.rating);
        System.out.println("Movie Director: " + movie1.director);

        */
/*
Steps

1. Create a Movie class with the following properties -- I'll leave it to you to decide what the appropriate data types would be:
title
movieLengthInMinutes
rating (ratings can be R, G, PG, PG-13)
director
2. Add a constructor method

3. Add getters and setters.

4. In your Main class' main() method, create two instances of the movie class.



 */