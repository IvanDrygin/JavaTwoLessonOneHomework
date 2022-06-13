package geekbrains.com.Homework.Participant;

public class Robot implements Participant {

    private final String name;

    public Robot (String name) {
        this.name = name;
    }
    public int run(){return 200;};
    public int jump(){return 5;};

    @Override
    public String toString() {
        return "Робот";
    }
}

