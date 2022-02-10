/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
https://leetcode.com/problems/longest-common-prefix/

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        //prefix = flower
        String prefix = strs[0];

        if(strs.length == 0) return "";
        //iterate starting from the second element in the array
        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                //reduce length of prefix to until prefix found
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
