package Projects.NumberQuest;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int SecretNum = r.nextInt(50) + 1;

        System.out.println("Welcome to Number Quest! Please Input Your Name! > ");
        String PlayersName = sc.nextLine();


        NumberQuest N = new NumberQuest(PlayersName, SecretNum);

        while(true) {

            System.out.println("Welcome " + PlayersName + "!");

            while(N.getPlayersHealth() > 0){
                System.out.println("Please Select a Number Between 1 and 50! \nOr Exit With 0!");

                int playerGuess = sc.nextInt();

                if(playerGuess == 0){
                    System.out.println("Thanks For Playing! Good-Bye!");
                    System.exit(0);
                }

                if(playerGuess > 50 || playerGuess <= 0){
                    System.out.println("That Number Is Too Small Or Too Big! Please Try Again! > ");
                    continue;
                }

                if(N.getPlayersHealth() == 0) {
                    System.out.println("You Lost! Better Luck Next Time " + PlayersName + "!");
                    N.setPlayersHealth(2);
                    SecretNum = r.nextInt(50) + 1;
                    break;
                }

                if(playerGuess == SecretNum){
                    System.out.println("You Win!");
                    SecretNum = r.nextInt(50) + 1;
                    System.out.println("You had " + N.getPlayersHealth() + " hearts left!");
                    N.setPlayersHealth(2);
                    break;
                } else if (playerGuess < SecretNum) {
                    System.out.println("Too Low! Try Again!");
                    N.setPlayersHealth(N.getPlayersHealth() - 1);
                } else if (playerGuess > SecretNum) {
                    System.out.println("Too High! Try Again!");
                    N.setPlayersHealth(N.getPlayersHealth() - 1);
                }
            }



        }
    }
}
