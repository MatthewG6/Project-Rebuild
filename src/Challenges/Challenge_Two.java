package Challenges;

public class Challenge_Two {
    public static void main(String[] args) {
        int score = 76;

        if (score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int i = 10;

        while(i >= 1) {
            System.out.println(i);
            i--;
        }

    }
}
