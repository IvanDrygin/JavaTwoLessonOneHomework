package geekbrains.com.Homework.Participant;

public class Human implements Participant {

    private final String name;

    public Human(String name) {
        this.name = name;
    }
    public int run(){return 150;};
    public int jump(){return 3;} ;


    @Override
    public String toString() {
        return "Человек";
    }
}