package Projects;

import java.util.Scanner;

public class MiniCalculator {

    public double add(int x, int y) {
        double sum = x + y;
        return sum;
    }

    public double sub(int x, int y) {
        double difference = x - y;
        return difference;
    }

    public double multiply(int x, int y) {
        double product = x * y;
        return product;
    }

    public double divide(int x, int y) {
        double quotient = x / y;
        return quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniCalculator calc = new MiniCalculator();

        int x;
        int y;




        while(true) {
            System.out.println("Welcome to Mini Calculator!");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Input two numbers to add >");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(calc.add(x, y));
                    break;
                case 2:
                    System.out.println("Input two numbers to subtract >");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(calc.sub(x, y));
                    break;
                case 3:
                    System.out.println("Input two numbers to multiply >");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(calc.multiply(x, y));
                    break;
                case 4:
                    System.out.println("Input two numbers to divide >");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(calc.divide(x, y));
                    break;
                case 5:
                    System.out.println("Thank you for using my Mini Calculator! Goodbye!");
                    System.exit(0);
                    break;
            }
        }
    }
}