package Projects.NumberQuest;

public class NumberQuest {
    String PlayersName;
    private int PlayersHealth;
    int SecretNum;

    public NumberQuest (String PlayersName, int secretNum){
        this.PlayersName = PlayersName;
        PlayersHealth = 2;
        this.SecretNum = secretNum;
    }

    public String toString(){
       return "Players Name: " + PlayersName + "\nPlayers Health: " + PlayersHealth;
    }

    public int getPlayersHealth(){
        return PlayersHealth;
    }
    public void setPlayersHealth(int p){
        PlayersHealth = p;
    }
}

