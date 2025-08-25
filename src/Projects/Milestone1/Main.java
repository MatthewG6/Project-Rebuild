package Projects.Milestone1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        GradeBook gb = new GradeBook();

        while(true){
            System.out.println("1) Add Grade\n2) List Grades\n3) Edit Grade\n4) Remove Grade\n5) Stats\n6) Letter\n7) Exit");

            int input = sc.nextInt();

            switch (input){
                case 1:
                    System.out.println("Please input the name, category, and score please\n");
                    System.out.println("Name > ");
                    String name = sc.next();

                    System.out.println("Category > ");
                    String category = sc.next();

                    System.out.println("Score > ");
                    double score = sc.nextDouble();

                    Grade g = new Grade(name, category, score);

                    gb.addGrade(g);

                    System.out.println("Grade added successfully!");
                    break;

                case 2:
                    gb.listGrades();
                    break;
                case 3:
                    System.out.println("Please input the grade index, the new name, the new category, and the new score\n");

                    System.out.println("Index > ");
                    int index = sc.nextInt();

                    System.out.println("New Name > ");
                    String newName = sc.next();

                    System.out.println("New Category > ");
                    String newCategory = sc.next();

                    System.out.println("New Score > ");
                    double newScore = sc.nextDouble();

                    gb.editGrade(index, newName, newCategory, newScore);
                    break;
                case 4:
                    System.out.println("Input the index of the grade that you would like to remove");

                    System.out.println("Grade Index > ");
                    int in = sc.nextInt();

                    gb.removeGrade(in);
                    break;
                case 5:
                   double average = gb.getAverage();
                   double highest = gb.getHighest();
                   double lowest = gb.getLowest();

                   System.out.println("Grade Average: " + average + "\nHighest Grade: " + highest + "\nLowest Grade: " + lowest);
                   break;
                case 6:
                    System.out.println("Please enter a grade index\n");

                    System.out.println("Grade Index >");
                    int gradeIn = sc.nextInt();

                   String letterGrade = gb.getLetterGrade(gradeIn);
                   System.out.println("The letter grade is "+ letterGrade);
                   break;
                case 7:
                    System.exit(0);
            }


        }
    }
}
