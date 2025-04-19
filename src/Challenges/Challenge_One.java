package Challenges;

public class Challenge_One {
    public static void main(String[] args) {
        int num1, num2;
        boolean isEqual;

        num1 = 2;
        num2 = 3;

        int sum = num1 + num2;

        int dif = num1 - num2;

        if (num1 == num2) {
            isEqual = true;
        } else {
            isEqual = false;
        }

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(isEqual);
    }
}
