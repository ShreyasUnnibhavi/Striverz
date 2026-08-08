package BasicMaths;

public class GCD {
    public static int gcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a %= b;
            }else {
                b %= a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 5;
        System.out.println(gcd(n1, n2));
    }
}
