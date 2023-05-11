package leetcode.hashing.examples.checkingforexistence;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(int num : nums) {
            if (numsSet.contains(num)) {
                return true;
            } else {
                numsSet.add(num);
            }
        }
        return false;
    }
}
