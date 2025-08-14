package Projects.InheritanceSimulation;

public class Main {

    public static void main(String[] args) {

        Animal bird = new Bird("finch", 6, true);
        Animal fish = new Fish("Bob", 8, "Salt Water");
        Animal mammal = new Mammal("Marg", 13, "brown");

        Animal[] arr = {bird, fish, mammal};

        for(Animal a : arr){
            System.out.println(a.toString());
            System.out.println(a.speak());
        }
    }
}
