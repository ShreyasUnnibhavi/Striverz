package Recursion;

public class StringPalindrome {
    public static boolean isPalindrome(String str, int index) {
        if(index >= str.length() / 2) {
            return true;
        }
        if(str.charAt(index) != str.charAt(str.length() - 1 - index)) {
            return false;
        }
        return isPalindrome(str, index + 1);
    }
    public static void main(String[] args) {
        String str = "SHRYASAYERHS";
        System.out.println(isPalindrome(str, 0));
    }
}
