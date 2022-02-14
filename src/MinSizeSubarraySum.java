/*
209. Minimum Size Subarray Sum
https://leetcode.com/problems/minimum-size-subarray-sum/
Given an array of positive integers nums and a positive integer target,
return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
of which the sum is greater than or equal to target. If there is no such subarray,
return 0 instead.

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
The subarray [4,3] has the minimal length under the problem constraint.
 */

public class MinSizeSubarraySum {
    static int minSubArrayLen(int target, int[] nums) {
        //using sliding window technique
        int min = Integer.MAX_VALUE;
        int start = 0, sum = 0;

        for(int end=0; end<nums.length; end++) {
            sum += nums[end];

            while(sum >= target) {
                //current length: end-start+1
                min = Math.min(min, end-start+1);
                sum -= nums[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
