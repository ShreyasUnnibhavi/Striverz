package BasicMaths;

public class PalindromeNum {
    public static boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
            return original==rev;
    }
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
