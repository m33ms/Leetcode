/*
1446. Consecutive Characters
https://leetcode.com/problems/consecutive-characters/
The power of the string is the maximum length of a non-empty
substring that contains only one unique character.

Given a string s, return the power of s.
Input: s = "leetcode"
Output: 2
The substring "ee" is of length 2 with the character 'e' only.
 */

public class ConsecutiveChars {
    static int maxPower(String s) {
        //brute force
        int count = 1;
        int maxCount = 1;
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else
                count = 1;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "abbcccddddeeeeedcba";

        System.out.println(maxPower(s));
        System.out.println(maxPower(s2));
    }
}
