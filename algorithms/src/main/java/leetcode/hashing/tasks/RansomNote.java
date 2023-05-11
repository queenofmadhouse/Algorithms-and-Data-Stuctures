package leetcode.hashing.tasks;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> magazineChars = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            char charForStep = magazine.charAt(i);
            magazineChars.put(charForStep, magazineChars.getOrDefault(charForStep, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (magazineChars.containsKey(c)) {
                int magazineCount = magazineChars.getOrDefault(c, 0);

                if (magazineCount == 1) {
                    magazineChars.remove(c);
                } else {
                    magazineChars.put(c, magazineCount - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
