package Projects.InheritanceSimulation;

public class Fish extends Animal{

    private String waterType;

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public String speak(){
        return "Blub\n";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nWater Type: " + waterType;

    }
}
