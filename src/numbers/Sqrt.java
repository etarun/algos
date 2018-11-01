package numbers;


//https://leetcode.com/problems/sqrtx/

public class Sqrt {

    public static void main(String[] args) {
        int x = 9;
        int left = 1;
        int right = x, ans = 0;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(mid<= x/mid) {
                left = mid+1;
                ans = mid;
            } else {
                right = mid -1;
            }
        }
        System.out.println(ans);
    }
}
