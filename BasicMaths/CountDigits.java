package BasicMaths;

public class CountDigits {
    public static int count(int n) {
        int c = 0;
        while(n > 0) {
            c++;
            n /= 10;
        }
        return c;
        // return (int) Math.log(n) + 1;
    }
    public static void main(String[] args) {
        int n = 00001;
        System.out.println(count(n));
    }
}