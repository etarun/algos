package hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArray {

    public static void main(String[] args) {
        int arr[] = {0 ,1, 1, 1, 1, 1, 0, 0 ,1 ,1 ,0 ,1, 0, 0, 1, 1, 1, 0, 0 ,0 ,0 ,0};
        System.out.print(maxLen(arr));
    }
    static int maxLen(int[] nums)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
