/*
692. Top K Frequent Words
https://leetcode.com/problems/top-k-frequent-words/
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest.
Sort the words with the same frequency by their lexicographical order.
Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
 */

import java.util.*;

public class TopKFreqWords {
    static List<String> topKFrequent(String[] words, int k) {
        //create hashmap and add words with frequency
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        //create priority queue and sort
        PriorityQueue<String> maxHeap = new PriorityQueue<>((a,b) -> {
            return map.get(b) != map.get(a) ? map.get(b)-map.get(a) : a.compareTo(b);
        });
        maxHeap.addAll(map.keySet());

        //create list and return k most frequent
        List<String> result = new ArrayList<>();
        for(int i=0; i<k; i++) {
            result.add(maxHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] s = {"i","love","leetcode","i","love","coding"};
        String[] s2 = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 2;
        int j = 4;

        System.out.println(topKFrequent(s, k));
        System.out.println(topKFrequent(s2, j));
    }
}
