package Challenges.Challenge6;

public class Challenge6 {
    String name;
    int level;

    public Challenge6 (String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String describe () {
        return "My name is " + name + " and I'm level " + level;
    }

    public static void main (String[] args) {
        Challenge6[] party = {new Warrior("John", 14), new Mage("Cara", 22)};

        for (Challenge6 c : party) {
            System.out.println(c.describe());
        }
    }
}




