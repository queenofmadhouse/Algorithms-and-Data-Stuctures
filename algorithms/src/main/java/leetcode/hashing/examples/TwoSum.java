package leetcode.hashing.examples;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (dic.containsKey(complement)) { // This operation is O(1)!
                return new int[] { i, dic.get(complement) };
            }
            dic.put(num, i);
        }

        return new int[] { -1, -1};
    }
}
