package OOP;

class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    class Classroom {
        private int room;
        private String sub;

        public Classroom() {
            room = 0;
            sub = "NIL";
        }

        public Classroom(int room, String sub) {
            this.room = room;
            this.sub = sub;
        }

        public void displayClassDetails() {
            System.out.println("Room: " + room + "\nSubject: " + sub);
        }

        public void introduce() {
            System.out.println("I study at " + name + " school.");
        }
    }

    public void introduce() {
        Classroom cl = new Classroom();
        cl.introduce();
    }
}
public class InnerClass {
    public static void main(String[] args) {
        School mySchool = new School("KLE");
        School.Classroom math = mySchool.new Classroom(101, "Math");
        math.displayClassDetails();
        System.out.println("--------------------------");
        mySchool.introduce();
    }
}
