package leetcode.hashing.tasks;

import java.util.HashMap;
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();

        int count = 0;

        for(int num : nums) {
            if (!map.containsKey(num)) {
                count += num;
                map.put(num, 1);
            } else {
                if (map.get(num) == 1) {
                    count -= num;
                }
                map.put(num, map.get(num) +1);
            }
        }

        return count;
    }
}
