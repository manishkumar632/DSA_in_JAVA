import java.util.Scanner;

public class PalindromeString {
    private static boolean isPalindrome(String str) {
        int front = 0;
        int last = str.length() - 1;
        while (front < last) {
            if (str.charAt(front) != str.charAt(last))
                return false;
            front++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Is the string a palindrome? " + isPalindrome(str));
    }
}
