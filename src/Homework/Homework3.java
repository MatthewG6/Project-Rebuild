package Homework;

import javax.sound.midi.Soundbank;

public class Homework3 {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b){
        int dif = a - b;
        return dif;
    }

    public void showResults(int sum, int dif) {
        System.out.println("The sum is " + sum + "!");
        System.out.println("The difference is " + dif + "!");
    }

    public static void main (String[] args) {
        Homework3 home = new Homework3();
       int sum = home.add(7, 3);
       int dif = home.subtract(7, 3);

       home.showResults(sum, dif);
    }
}
