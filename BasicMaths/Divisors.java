package BasicMaths;

import java.util.ArrayList;

public class Divisors {
    public static void printDivisors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= num; i++) {
            if(num % i == 0) {
                list.add(i);
                if(i != num / i) {
                    list.add(num / i);
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int num = 36;
        printDivisors(num);
    }
}
