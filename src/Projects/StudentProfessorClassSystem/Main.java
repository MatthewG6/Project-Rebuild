package Projects.StudentProfessorClassSystem;

public class Main {
    public static void main(String[] args){
        Student Matthew = new Student("Matthew", 23, "Computer Science");
        Student Cara = new Student("Cara", 23, "Nursing");

        Professor Dean = new Professor("Mr.Dean", 43, "History");

        Person[] ar = {Matthew, Cara, Dean};

        for(Person p : ar){
            System.out.println(p.toString());
        }
    }
}
