package Homework.Homework6;

public class ApexLegends extends VideoGame {
    public ApexLegends(String name, String type) {
        super(name, type);
    }

    @Override
    public String describe(){
        return super.describe() + " Try to be the last alive!";

    }
}

