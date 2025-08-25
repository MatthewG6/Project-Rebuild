package Projects.Milestone1;

public class Grade {
    private String name;
    private String category;
    private double score;

    public Grade(String name, String category, double score){
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString(){
        return "Assignment Name: " + name + " (" + category + ")\nScore: " + score;
    }
}
