package leetcode.hashing.examples.counting;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/subarray-sum-equals-k/
*/
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            curr += num;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
