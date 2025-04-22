package Homework;

import java.util.Scanner;

public class Homework2 {

    public int tryAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Try entering a new integer > ");
       int retry = sc.nextInt();
       return retry;
    }

    public static void main(String[] args) {
        Homework2 home = new Homework2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer 1-10 > ");
        int input = sc.nextInt();

        int num = (int) (Math.random() * 10) + 1;
        int count = 1;

        while(count < 3) {
            if (input == num) {
                System.out.println("You got it!");
                count = 3;
            } else if (input > num) {
                System.out.println("To High!");
                input = home.tryAgain();
                count++;
            } else if (input < num){
                System.out.println("To Small!");
                input = home.tryAgain();
                count++;
            }
        }
    }
}
