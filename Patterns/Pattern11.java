public class Pattern11 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + j + 1) % 2);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
