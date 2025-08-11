package Projects.StudentProfessorClassSystem;

public class Professor extends Person{
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nDepartment: " + department;
    }
}
