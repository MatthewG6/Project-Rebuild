package Challenges;

public class Challenge_Three {
    public void greetUser(String name) {
        System.out.println("Welcome " + name + "!");
    }

    public int multiply (int a, int b) {
        int product = a * b;
        System.out.println("The product of a and b is " + product);
        return product;
    }

    public boolean isEven(int num) {
        if(num % 2 == 0) {
            System.out.println("The number is even");
            return true;
        }
        System.out.println("The number is false");
        return false;
    }

    public static void main (String[] args) {
        Challenge_Three three = new Challenge_Three();

        three.greetUser("Matthew");
        three.multiply(4, 5);
        three.isEven(6);

    }
}
