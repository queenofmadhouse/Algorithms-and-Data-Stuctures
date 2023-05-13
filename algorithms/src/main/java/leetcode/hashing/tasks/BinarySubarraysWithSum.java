package leetcode.hashing.tasks;

import java.util.HashMap;
import java.util.Map;

/*
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15

Constraints:

1 <= nums.length <= 3 * 10^4
nums[i] is either 0 or 1.
0 <= goal <= nums.length
*/
public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            curr += num;
            ans += counts.getOrDefault(curr - goal, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
