package Challenges;

public class Challenge_four {
    String title;
    String author;
    int yearPublished;

    public void printInfo(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nYear Published: " + yearPublished);
    }

    public static void main(String[] args) {
        Challenge_four bookOne = new Challenge_four();
        bookOne.title = "The Name of the Wind";
        bookOne.author = "Patrick Rothfuss";
        bookOne.yearPublished = 2004;

        bookOne.printInfo();

        Challenge_four bookTwo = new Challenge_four();
        bookTwo.title = "Red Rising";
        bookTwo.author = "Chris";
        bookTwo.yearPublished = 2011;

        bookTwo.printInfo();
    }
}
