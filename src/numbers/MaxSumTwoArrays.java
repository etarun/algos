package numbers;

//https://www.geeksforgeeks.org/k-maximum-sum-combinations-two-arrays/

import java.text.Collator;
import java.util.*;

public class MaxSumTwoArrays {
    public static void main(String[] args) {
        Integer[] a = {4, 2, 5, 1};
        Integer[] b = {8, 0, 3, 5};
        int k =3;
/*        ArrayList<Integer[]> result = new ArrayList<Integer[]>(k);

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());

        if (k < 1 || a.length == 0 || b.length == 0)
            System.out.println("asd");

        result.add(new Integer[] { a[0], b[0] });

        int aIndex = 1, bIndex = 1;
        while (result.size() < k && aIndex < a.length && bIndex < b.length)
            result.add((a[0] + b[bIndex] > b[0] + a[aIndex]) ? new Integer[] { a[0], b[bIndex++] } : new Integer[] { a[aIndex++], b[0] });

        while (result.size() < k && aIndex < a.length)
            result.add(new Integer[] { a[aIndex++], b[0] });

        while (result.size() < k && bIndex < b.length)
            result.add(new Integer[] { a[0], b[bIndex++] });

        for(int i=0;i<result.size();i++) {
            System.out.println(Arrays.toString(result.get(i)));
        }*/


        ArrayList<Integer> result = new ArrayList<>(k);

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b, Collections.reverseOrder());

        if (k < 1 || a.length == 0 || b.length == 0)
            System.out.println("asd");

        result.add(a[0]+b[0]);

        int aIndex = 1, bIndex = 1;
        while (result.size() < k && aIndex < a.length && bIndex < b.length)
            result.add((a[0] + b[bIndex] > b[0] + a[aIndex]) ? a[0]+b[bIndex++] : a[aIndex++]+b[0]);

        while (result.size() < k && aIndex < a.length)
            result.add(a[aIndex++]+b[0]);

        while (result.size() < k && bIndex < b.length)
            result.add(a[0]+b[bIndex++]);

        for(int i=0;i<result.size();i++) {
            System.out.println((result.get(i)));
        }

    }
}
