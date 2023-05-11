package leetcode.hashing.tasks;

import java.util.HashMap;
import java.util.Map;

/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
*/
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> stonesCount = new HashMap<>();
        int count = 0;

        for(int i = 0; i < stones.length(); i++) {

            char charForStep = stones.charAt(i);

            stonesCount.put(charForStep, stonesCount.getOrDefault(charForStep, 0) + 1);
        }

        for(char c : jewels.toCharArray()) {
            if (stonesCount.containsKey(c)) {
                count += stonesCount.get(c);
            }
        }
        return count;
    }
}
