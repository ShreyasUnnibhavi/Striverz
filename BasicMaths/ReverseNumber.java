package BasicMaths;

public class ReverseNumber {
    public static int reverse(int num) {
        int rev = 0;
        while(num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 123400;
        System.out.println(reverse(num));
    }
}
