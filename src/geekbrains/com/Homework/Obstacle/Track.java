package geekbrains.com.Homework.Obstacle;

import geekbrains.com.Homework.Participant.Participant;

public class Track implements Obstacle {

    private final int lenght;
    public Track(int lenght) {this.lenght = lenght;}

    @Override
    public boolean passObstacle(Participant participant) {
        if (lenght <= participant.run()){
            System.out.println("Успешно пробежал");
            return true;
        }
        System.out.println("не смог");
        return false;
    }
}
