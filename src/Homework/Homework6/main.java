package Homework.Homework6;

public class main {
    public static void main (String[] args) {
        VideoGame[] favGames = {new EldenRing("Elden Ring", "Role Playing Game"), new ApexLegends("Apex Legends", "Battle Royal")};

        for (VideoGame g : favGames) {
            System.out.println(g.describe());
        }
    }
}
