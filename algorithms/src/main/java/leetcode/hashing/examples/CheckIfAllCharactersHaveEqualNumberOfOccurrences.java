package leetcode.hashing.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
*/
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c: s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>(counts.values());
        return frequencies.size() == 1;
    }
}
