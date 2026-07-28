public class Pattern12 {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            //Numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            //Spaces
            for (int j = 0; j < (n - i - 1) * 2; j++) {
                System.out.print(" ");
            }

            //Numbers
            for(int j = i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
