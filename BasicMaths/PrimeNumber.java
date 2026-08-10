package BasicMaths;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                count++;
                if(num / i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isPrime(num));
    }
}
