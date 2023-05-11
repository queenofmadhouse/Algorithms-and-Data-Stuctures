package leetcode.hashing.examples.counting;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/count-number-of-nice-subarrays/
*/
public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            curr += num % 2;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}