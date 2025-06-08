package Homework.Homework6;

public class EldenRing extends VideoGame{
    public EldenRing(String name, String type) {
        super(name, type);
    }

    @Override
    public String describe() {
        return super.describe() + " Try to kill all the bosses!";
    }
}
