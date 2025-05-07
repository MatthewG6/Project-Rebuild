package Homework;

public class Homework5 {
    String name, role;
    int level;

    public Homework5 (String name, String role, int level){
        this.name = name;
        this.role = role;
        this.level = level;
    }

    public Homework5 (String name) {
        this.name = name;
        this.level = 1;
        this.role = "Unknown";
    }

    public String printInfo() {
        return "Name: " + name + "\nRole: " + role + "\nLevel: " + level + "\n";
    }

    public static void main (String[] args) {
        Homework5 character = new Homework5("Drine", "Archer", 43);
        Homework5 character2 = new Homework5("Nate");

        System.out.println(character.printInfo());
        System.out.println(character2.printInfo());

    }
}
