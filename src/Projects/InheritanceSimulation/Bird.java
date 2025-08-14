package Projects.InheritanceSimulation;

public class Bird extends Animal{
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String speak(){
        return "Chirp!\n";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nCan Fly?: " + canFly;

    }
}
