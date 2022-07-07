/*340. Longest Substring With At Most K Distinct Chars
Given a string s and an integer k, return the length
of the longest substring of s that contains at most k
distinct characters.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubMaxK {
    static int longestSubMaxK(int k, String s) {
        //pointers
        int left = 0, right = 0;

        //convert string to char array
        char[] arr = s.toCharArray();

        //define maxlength
        int maxLength = 0;
        int n = arr.length;

        //define hashmap
        Map<Character, Integer> map = new HashMap<>();

        //base case
        if(k==0) return 0;

        //sliding window technique
        while (right < n) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+ 1);

            //contract window size if greater than k
            while(map.size() > k) {
                //decrease count of left char by 1
                map.put(arr[left], map.get(arr[left]) - 1);

                //if left char is now 0, remove
                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                    //move left pointer by 1
                left++;
            }
            //update max length
            maxLength = Math.max(maxLength, right-left + 1);
            right++;
        }
    return maxLength;
    }


    public static void main(String[] args) {
        String s = "ecceb";
        int k = 2;
        System.out.println(longestSubMaxK(k, s));

        String s2 = "aa";
        int k2 = 1;
        System.out.println(longestSubMaxK(k, s2));
    }
}
