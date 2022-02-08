/*
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and
return this value. Any answer with a calculation error less than 10-5 will be accepted.

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */

import java.util.Queue;
import java.util.LinkedList;

public class MaxAverageSubarrayI {
    static double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        double avg = Double.NEGATIVE_INFINITY;
        double sum = 0;

        Queue<Integer> list = new LinkedList<>();

        for(int i=0; i<nums.length;i++) {
            list.add(nums[i]);
            sum += nums[i];

            if (list.size() == k) {
                avg = sum / k;
                max = Math.max(max, avg);
                sum -= list.poll();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
