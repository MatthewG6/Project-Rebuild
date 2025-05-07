package Challenges.Challenge6;

public class Mage extends Challenge6{
    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public String describe() {
        return super.describe() + " I cast spells";
    }
}
