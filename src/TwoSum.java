/*
1. Two Sum https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1] Because nums[0] + nums[1] == 9
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        //using hashmap to find the key of difference value
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];

            //if mapping contains value of difference
            if(map.containsKey(diff)) {
                //set values of result to current index and key of diff
                result[0] = i;
                result[1] = map.get(diff);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] n2 = {3,2,4};
        int targ = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(n2, targ)));
    }

}
