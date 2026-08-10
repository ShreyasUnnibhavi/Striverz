package BasicMaths;

public class Armstrong {
    public static boolean check(int num) {
        int pow = String.valueOf(num).length();
        int n = num;
        int sum = 0;
        while(n > 0) {
            sum += Math.pow(n % 10, pow);
            n /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 371;
        System.out.println(check(num));
    }
}
