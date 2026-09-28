package OOP;

interface InterfaceA {
    default void display() {
        System.out.println("Display from Interface A");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from Interface B");
    }
}

class SubClass implements InterfaceA, InterfaceB {
    public void display() {
        InterfaceA.super.display();
    }
}
public class InterfaceDefault {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.display();
    }
}
