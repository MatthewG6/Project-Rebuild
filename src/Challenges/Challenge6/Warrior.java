package Challenges.Challenge6;

public class Warrior extends Challenge6 {

    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public String describe() {
        return super.describe() + " I swing a sword";
    }
}
