package Homework.Homework6;

public class VideoGame {
    String name;
    String type;

    public VideoGame(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String describe (){
        return "Hello I am a video game, my name is " + name + " and my game type is " + type + ".";
    }
}
