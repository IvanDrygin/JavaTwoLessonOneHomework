package geekbrains.com.Homework.Participant;

public class Cat implements Participant {


    private final String name;

    public Cat (String name) {
        this.name = name;
    }
    public int run(){return 50;};
    public int jump(){return 10;};



    @Override
    public String toString() {
        return "Кошка";
    }

}
