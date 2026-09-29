package OOP;

class OuterClass {
    private String outerField = "Outer private field";
    private static String outerStaticField = "Outer static private field";

    private void outerMethod() {
        System.out.println("Executed Outer method");
    }

    void process(int parameter) {
        int effectivelyFinalVar = 100;
        int reassignedVar = 100;
        reassignedVar = 300;

        class LocalInner {
            void display() {
                System.out.println(outerField); //* ALLOWED */
                System.out.println(outerStaticField); //* ALLOWED */
                outerMethod(); //* ALLOWED */

                System.out.println("parameter: " + parameter); //* ALLOWED */
                System.out.println("Local variable: " + effectivelyFinalVar); //* ALLOWED */

                //System.out.println(reassignedVar);  //! Not allowed, only final or effectively final variables from the outer method are allowed
            }
        }

        LocalInner local = new LocalInner();
        local.display();
    }
}

public class LocalClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.process(10);
    }
}