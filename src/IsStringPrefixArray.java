/*
1961. Check If String Is a Prefix of Array
https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/

Given a string s and an array of strings words, determine whether s is a prefix string of words.
A string s is a prefix string of words if s can be made by concatenating the first
k strings in words for some positive k no larger than words.length.
Return true if s is a prefix string of words, or false otherwise.

Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
 */

public class IsStringPrefixArray {
   static boolean isPrefixString(String s, String[] words) {
        //using StringBuilder because it is mutable
       StringBuilder str = new StringBuilder();

       for(String word: words) {
           str.append(word);

           //if the string s is equal to str
           //return true
           if(s.equals(str.toString())) {
               return true;
           }
       }
       return false;
   }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};

        String s2 = "iloveleetcode";
        String[] words2 = {"apples","i","love","leetcode"};

        System.out.println(isPrefixString(s, words));
        System.out.println(isPrefixString(s2, words2));
    }
}
