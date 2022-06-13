package geekbrains.com.Homework;

import geekbrains.com.Homework.Obstacle.Track;
import geekbrains.com.Homework.Obstacle.Wall;
import geekbrains.com.Homework.Participant.Cat;
import geekbrains.com.Homework.Participant.Human;
import geekbrains.com.Homework.Participant.Participant;
import geekbrains.com.Homework.Participant.Robot;

public class Compitition {


    public static void main(String[] args) {
        Participant human =  new Human("Human");
        Participant cat =  new Cat("Cat");
        Participant robot =  new Robot("Robot");
        Track track = new Track(150);
        Wall wall = new Wall(10);
        System.out.println("Бег");
        System.out.println();
        System.out.println();
        runTrack(track,robot,human,cat);
        System.out.println();
        System.out.println();
        System.out.println("Прыжок");
        System.out.println();
        System.out.println();
        jumpWall(wall,robot,human,cat);

    }

    private static void runTrack (Track track,Participant ...participants) {

        for (Participant participant : participants){
            System.out.println();
            System.out.println(participant);
            System.out.println();
            System.out.println("приступил");
            System.out.println();
            System.out.println(track.passObstacle(participant));
        }

    }
    private static void jumpWall (Wall wall,Participant ...participants) {

        for (Participant participant : participants){
            System.out.println();
            System.out.println(participant);
            System.out.println();
            System.out.println("приступил");
            System.out.println();
            System.out.println(wall.passObstacle(participant));
        }

    }

}
