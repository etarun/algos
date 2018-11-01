package strings;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

/*
Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a
subsequence and not a substring.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(char[] s1, char[] s2, int m, int n) {
        int[][] LCStuff = new int[m+1][n+1];
        int result = 0;
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (s1[i - 1] == s2[j - 1])
                {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestSubstring l= new LongestSubstring();
        String s1 = "abcabcbb";
        String s2 = "abc";
        System.out.print(l.lengthOfLongestSubstring(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
    }
}
