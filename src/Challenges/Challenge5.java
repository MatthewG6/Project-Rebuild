package Challenges;

public class Challenge5 {
    String title, genre, type;
    double length;

    public Challenge5 (String title, String genre, String type, double length) {
        this.title = title;
        this.genre = genre;
        this.type = type;
        this.length = length;
    }

    public Challenge5 (String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.length = 16.0;
        this.type = "Unknown";
    }

    public static void main (String[] args) {
        Challenge5 game = new Challenge5("KCD2", "Fantasy", "RPG", 86.0 );
        Challenge5 game2 = new Challenge5("TLOU", "Horror survival");

        System.out.println(game.title + " " + game.genre + " " + game.type + " " + game.length);
        System.out.println(game2.title + " " + game2.genre + " " + game2.type + " " + game2.length);

    }
}
