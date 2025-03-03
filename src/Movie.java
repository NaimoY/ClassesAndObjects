public class Movie {
    String movieTitle;
    int movieLengthInMinutes;
    String rating;
    String director;

    public Movie(String title, int movieLengthInMinutes, String rating, String director) {
        movieTitle = title;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.rating = rating;
        this.director = director;
    }

    public String getTitle() {
        return movieTitle;
    }

    public void setTitle(String title) {
        movieTitle = title;
    }

    public int getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }

    public void setMovieLengthInMinutes(int movieLengthInMinutes) {
        this.movieLengthInMinutes = movieLengthInMinutes;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void displayMovie(){
        System.out.println("Movie Title:  " + movieTitle + " Movie Length: " + movieLengthInMinutes + " Movie Rating: " + rating + " Movie Director: " + director );
    }
}


/*
1. Create a Movie class with the following properties -- I'll leave it to you to decide what the appropriate data types would be:
title
        movieLengthInMinutes
rating (ratings can be R, G, PG, PG-13)
director
2. Add a constructor method

3. Add getters and setters.

        4. In your Main class' main() method, create two instances of the movie class.
        */
