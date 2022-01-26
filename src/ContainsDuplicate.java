/*
217. Contains Duplicate: https://leetcode.com/problems/contains-duplicate/
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true
 */

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {
        //algorithm: using hashset, hashset does not allow duplicates
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(set.add(nums[i]) == false) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] nums2 = {1,2,3,4};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
    }
}
