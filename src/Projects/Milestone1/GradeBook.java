package Projects.Milestone1;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    List<Grade> grades = new ArrayList<>();

    public GradeBook() {
        this.grades = new ArrayList<>();
    }

    public GradeBook(List<Grade> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(Grade g){
        grades.add(g);
    }

    public List<Grade> getGrades(){
        return grades;
    }

    public void removeGrade(int in){
        grades.remove(in);
    }

    public void listGrades(){
        if(grades.isEmpty()){
            System.out.println("No grades yet!");
            return;
        }
        for (int i = 0; i < grades.size(); i++){
            System.out.println(i + ") " + grades.get(i));
        }
    }

    public void editGrade(int index, String newName, String newCategory, double newScore){
        Grade g = grades.get(index);
        g.setName(newName);
        g.setCategory(newCategory);
        g.setScore(newScore);
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0; // avoid divide by zero if no grades
        }

        double total = 0.0;

        for (Grade g : grades) {
            total += g.getScore();
        }

        return total / grades.size();
    }

    public double getHighest(){
        double highest = 0;
        for(int i = 0; i < grades.size(); i++){
            Grade g = grades.get(i);
            double grade = g.getScore();

            if(i == 0){
                highest = grade;
            } else if(highest < grade){
                highest = grade;
            }
        }
        return highest;
    }

    public double getLowest(){
        double lowest = 0;
        for(int i = 0; i < grades.size(); i++){
            Grade g = grades.get(i);
            double grade = g.getScore();

            if(i == 0){
                lowest = grade;
            } else if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

    public String getLetterGrade(int in){
        Grade grade = grades.get(in);
        double score = grade.getScore();
        String letter;
        System.out.println("The score is " + score);

        if (score >= 90){
            letter = "A";
        } else if(score >= 80){
            letter = "B";
        } else if(score >= 70){
            letter = "C";
        } else if(score >= 60){
           letter = "D";
        } else{
            letter = "F";
        }
        return letter;
    }

}
