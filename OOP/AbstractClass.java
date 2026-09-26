package OOP;

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override 
    void startEngine() {
        System.out.println("car engine started with push button ignition");
    }
}

class Train extends Vehicle {
    public Train(String brand) {
        super(brand);
    }

    @Override 
    void startEngine() {
        System.out.println("Train started with steam engine");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle car = new Car("Mahindra");
        car.displayBrand();
        car.startEngine();

        Vehicle train = new Train("Indian railways");
        train.displayBrand();
        train.startEngine();
    }
}
