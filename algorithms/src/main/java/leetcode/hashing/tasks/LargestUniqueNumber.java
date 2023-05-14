package leetcode.hashing.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.

Example 1:

Input: nums = [5,7,3,9,4,9,8,3,1]
Output: 8
Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.

Example 2:

Input: nums = [9,9,8,8]
Output: -1
Explanation: There is no number that occurs only once.


Constraints:

1 <= nums.length <= 2000
0 <= nums[i] <= 1000
*/
public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {

        Set<Integer> seenOnes = new HashSet<>();
        Set<Integer> seenMoreThenOnes = new HashSet<>();

        for(int num : nums) {

            if(seenOnes.contains(num)) {
                seenOnes.remove(num);
                seenMoreThenOnes.add(num);
            } else if(seenMoreThenOnes.contains(num)) {
                continue;
            } else {
                seenOnes.add(num);
            }
        }

        List<Integer> ans = new ArrayList<>(seenOnes);
        Collections.sort(ans);

        if (ans.size() >= 1) {
            return ans.get(ans.size() - 1);
        } else {
            return -1;
        }
    }
}
