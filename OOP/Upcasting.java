package OOP;

class Device {
    public void powerOn() {
        System.out.println("Device is powere on.");
    }
    public void test1() {
        System.out.println("test");
    }
}

class Smartphone extends Device {
    public void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }

    public void test() {
        System.out.println("test");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Device myDevice = new Smartphone();
        myDevice.powerOn();
    }
}