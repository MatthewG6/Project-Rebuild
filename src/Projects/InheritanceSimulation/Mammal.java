package Projects.InheritanceSimulation;

public class Mammal extends Animal{

    private String furcolor;

    public Mammal(String name, int age, String furcolor) {
        super(name, age);
        this.furcolor = furcolor;
    }


    public String getFurcolor() {
        return furcolor;
    }

    public void setFurcolor(String furcolor) {
        this.furcolor = furcolor;
    }

    @Override
    public String speak(){
        return "Mammal Noise\n";
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nFur Color: " + furcolor;

    }
}
