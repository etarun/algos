package hashing;

import java.util.HashMap;

public class DistinctElementsInLimit {

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 3, 1, 5, 4};
        int k =4;
        countDistinct(arr, k);
    }

    private static void countDistinct(int[] arr, int k) {
        HashMap<Integer, Integer> hM = new HashMap<>();
        int dist_count = 0;
        for(int i=0;i<k;i++) {
            if(hM.get(arr[i]) == null) {
                hM.put(arr[i], 1);
                dist_count++;
            } else {
                int c = hM.get(arr[i]);
                hM.put(arr[i], c+1);
            }
        }
        System.out.println(dist_count);
        for(int j=k;j<arr.length;j++) {

            if(hM.get(arr[j-k]) == 1) {
                hM.remove(arr[j-k]);
                dist_count--;
            } else {
                int count = hM.get(arr[j-k]);
                hM.put(arr[j-k], count-1);
            }
            if(hM.get(arr[j]) == null) {
                hM.put(arr[j], 1);
                dist_count++;
            } else {
                int c = hM.get(arr[j]);
                hM.put(arr[j], c+1);
            }
            System.out.println(dist_count);
        }
    }
}
