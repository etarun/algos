package numbers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for(int i=0; i< nums.length;i++) {
            if(twoSumMap.containsKey(nums[i])) {
                return new int[] {twoSumMap.get(nums[i]) , i};
            } else {
                twoSumMap.put(target - nums[i], i);
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,5,7,11}, 13);
        System.out.print(result[0]);
        System.out.print(result[1]);
    }
}
