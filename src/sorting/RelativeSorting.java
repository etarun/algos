package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int t = 0; t < testCases; t++) {
            int arr1Size = sc.nextInt();
            int arr2Size = sc.nextInt();
            int[] arr1 = new int[arr1Size];
            int[] arr2 = new int[arr2Size];
            int[] arr3 = new int[arr1.length];

            for(int a1=0;a1<arr1Size;a1++){
                arr1[a1] = sc.nextInt();
            }

            for(int a1=0;a1<arr2Size;a1++){
                arr2[a1] = sc.nextInt();
            }

            int k = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        arr3[k] = arr1[j];
                        arr1[j] = -1;
                        k++;
                    }
                }
            }
            Arrays.sort(arr1);
            for (int m : arr1) {
                if (m != -1) {
                    arr3[k] = m;
                    k++;
                }
            }
            for (int l : arr3) {
                System.out.print(l+" ");
            }

        }
    }
}
