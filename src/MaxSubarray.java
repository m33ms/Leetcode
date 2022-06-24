/* 53. Maximum Subarray https://leetcode.com/problems/maximum-subarray/
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest sum and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */

public class MaxSubarray {
    //using kadane's algorithm
    static int maxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = maxSum;

        //iterate through array, starting with second element
        for(int i=1; i<arr.length; i++) {
            //keep currentSum as currentSum + next value in element or create new
            //currentSum as the next value in array
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(arr));

    }
}
