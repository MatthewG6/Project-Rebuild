package Homework;

public class HomeworkOne {
    public static void main (String[] args) {
        int i = 4;
        double d = 3.143925;
        char c = 'D';
        boolean k = true;

        System.out.println("int: " + i + "\ndouble: " + d + "\nchar: " + c + "\nboolean: " + k);

        int x = 10, y = 3;

        int sum = x + y;
        int dif = x - y;
        int prod = x * y;
        int qou = x / y;
        int mod = x % y;

        System.out.println("Sum: " + sum + "\nDifference: " + dif + "\nProduct: " + prod + "\nQuotient: " + qou + "\nModulus: " + mod);

        boolean a = true, b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

    }
}
