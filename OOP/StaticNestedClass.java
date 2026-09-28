package OOP;

class Calculator {
    static class MathOperations {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int a, int b) {
            return (double) a / b;
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        int sum = Calculator.MathOperations.add(10, 5);
        int difference = Calculator.MathOperations.subtract(10, 5);
        int product = Calculator.MathOperations.multiply(10, 5);
        double quotient = Calculator.MathOperations.divide(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
