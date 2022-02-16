/*
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWoutRepeat {
    static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0, end = 0;
        Set<Character> set = new HashSet<>();

        while(end < s.length()) {
            char currentChar = s.charAt(end);
            if(!set.contains(currentChar)) {
                set.add(currentChar);
                end++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbbbb";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
    }
}
