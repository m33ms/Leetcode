/*
451. Sort Characters By Frequency
https://leetcode.com/problems/sort-characters-by-frequency/
Given a string s, sort it in decreasing order based on the frequency of the characters.
The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.
Input: s = "tree"
Output: "eert"
 */

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharsByFrequency {
    static String frequencySort(String s) {
        //create hashmap to count character frequency
        HashMap<Character, Integer> map = new HashMap<>();
        //iterate through chars in string and add to map
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        //create priority queue to sort frequency from high to low
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        //add all chars to priority queue
        maxHeap.addAll(map.keySet());

        //create string builder and add chars
        StringBuilder result = new StringBuilder();
        while(!maxHeap.isEmpty()) {
            char current = maxHeap.remove();
            //iterate through hashmap to get frequency of char
            for(int i=0; i<map.get(current); i++) {
                result.append(current);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "tree";
        String s = "cccaaa";

        System.out.println(frequencySort(str));
        System.out.println(frequencySort(s));
    }
}
