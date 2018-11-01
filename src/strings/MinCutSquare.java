package strings;

import java.util.Scanner;

public class MinCutSquare {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*int j = scanner.nextInt();
        scanner.nextLine();*/
        int n = 14, m = 16;
        System.out.println(minimumSquare(n, m));
    }

    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    // Returns min number of squares needed
    static int minimumSquare(int a, int b)
    {
        int result = 0, rem = 0;

        // swap if a is small size side .
        if (a < b)
            swap(a, b);

        // Iterate until small size side is
        // greater then 0
        while (b > 0)
        {
            // Update result
            result += a/b;
            rem = a % b;
            a = b;
            b = rem;
        }

        return result;
    }

}
