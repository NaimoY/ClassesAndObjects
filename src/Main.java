//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("MuslimImpossible ", 90, "PG", "Talha Kalif");
        Movie movie1 = new Movie("Lion King ", 95, "PG 13", "T");
        movie.displayMovie();
        movie1.displayMovie();

        Reels reel = new Reels("Nawal ", 30, 150, 21, " I heart Chocolate");
        Reels reel1 = new Reels("Naima ",30, 100, 23, " Sunny Day, By: you");
        reel1.displayInsights();
        reel.displayInsights();
    }
}
