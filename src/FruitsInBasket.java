/*
904. Fruit Into Baskets
Given the integer array fruits, return the maximum number of fruits you can pick.
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
 */

import java.util.HashMap;
import java.util.Map;

public class FruitsInBasket {

    static int totalFruit(int[] fruits) {
        int left = 0, right = 0;
        int maxLength = 0;
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();

        //sliding window technique
        while(right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            //if more than 2 fruits found
            while(map.size() > k) {
                //decrease by 1 from left
                map.put(fruits[left], map.get(fruits[left])-1);

                if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            //calculate maxLength
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
    return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(totalFruit(arr));

        int[] arr2 = {1,2,3,2,2};
        System.out.println(totalFruit(arr2));
    }
}
