package strings;


//https://practice.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces/0

import java.util.Scanner;

public class Palindrome {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            System.out.println(s);
            s = s.replace(" ", "");
            boolean isPalindrome = true;
            int len = s.length() - 1;
            for (int j = 0; j < s.length()/2; j++) {
                if (s.charAt(j) != s.charAt(len)) {
                    isPalindrome = false;
                    break;
                }
                len--;
            }
            System.out.println(isPalindrome);
        }
    }
}
