public class Reels {
 String userID;
 int lengthInSeconds;
 int numberOfLikes;
 int getNumberOfShares;
 String backgroundSong;

    public Reels(String userID, int lengthInSeconds, int numberOfLikes, int getNumberOfShares, String backgroundSong) {
        this.userID = userID;
        this.lengthInSeconds = lengthInSeconds;
        this.numberOfLikes = numberOfLikes;
        this.getNumberOfShares = getNumberOfShares;
        this.backgroundSong = backgroundSong;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getGetNumberOfShares() {
        return getNumberOfShares;
    }

    public void setGetNumberOfShares(int getNumberOfShares) {
        this.getNumberOfShares = getNumberOfShares;
    }

    public String getBackgroundSong() {
        return backgroundSong;
    }

    public void setBackgroundSong(String backgroundSong) {
        this.backgroundSong = backgroundSong;
    }
    public void displayInsights(){
        System.out.println("User ID : " + userID + " Reel Length " + lengthInSeconds + " seconds " + " Likes: " + numberOfLikes + " Shares: " + getNumberOfShares + " Background song: " + backgroundSong);
    }
}
/*
Continue with the concept of classes and objects by implementing Instagram reels.

Steps

1. Create a Reel class with the following properties:

userId (this is the ID of the user who made the post)
lengthInSeconds
numberOfLikes
numberOfShares
backgroundSong
2. Add a constructor method

3. Add getters and setters.

4. In your Main class' main() method, create two instances of the movie class.
 */
