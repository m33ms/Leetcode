/*
347. Top K Frequent Elements
https://leetcode.com/problems/top-k-frequent-elements/

Given an integer array nums and an integer k,
return the k most frequent elements. You may return the answer in any order.

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
 */

import java.util.*;

public class TopKFreqElements {
    static int[] topKFrequent(int[] nums, int k) {
        //create an arraylist to store items from hashmap
        List<Integer> list = new ArrayList<>();

        //create hashmap to store and count frequency of integers
        //add values from nums array to map
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //iterate through newly created hashmap
        //if key values is >= k, add to list
        for(int key: map.keySet()) {
            if(map.get(key) >= k) {
                list.add(key);
            }
        }
        //create array
        //add values from arraylist to array
        int index = 0;
        int[] result = new int[list.size()];
        for(Integer i: list) {
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
