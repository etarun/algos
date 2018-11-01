package strings;

//https://practice.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints/0

import java.util.Scanner;

public class StringFormation {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int j = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<j;i++) {
            int n = scanner.nextInt();
            System.out.println(1 + (n * 2) +
                    (n * ((n * n) - 1) / 2));
        }
    }
}
