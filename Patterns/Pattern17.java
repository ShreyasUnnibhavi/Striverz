public class Pattern17 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            //Spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            //Letters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65));
            }
            for(int j = i - 1; j >= 0; j--) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
