package OOP;

class Robot {
    public void learn() {
        System.out.println("Robots learn very fast");
    }

    public void charge() {
        System.out.println("Robots need charging");
    }

    public void tasks() {
        System.out.println("robots complete tasks efficiently");
    }
}

class CleaningRobot extends Robot {
    @Override 
    public void learn() {
        System.out.println("cleaning robots learn cleaning techniques fast!");
    }

    @Override 
    public void tasks() {
        System.out.println("Cleaning robots clean the house efficiently!");
    }
}

class IndustrialRobot extends Robot {
    @Override 
    public void learn() {
        System.out.println("Industrial robots learn industrial techniques fast!");
    }

    @Override
    public void tasks() {
        System.out.println("Industrial robots complete industrial tasks efficiently");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Robot robo = new Robot();
        new Polymorphism().operateRobo(robo);

        robo = new CleaningRobot();
        new Polymorphism().operateRobo(robo);

        robo = new IndustrialRobot();
        new Polymorphism().operateRobo(robo);
    }

    public void operateRobo(Robot robo) {
        robo.learn();
        robo.charge();
        robo.tasks();
        System.out.println("------------------");
    }
}
