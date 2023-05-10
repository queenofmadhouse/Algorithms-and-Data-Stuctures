package leetcode.hashing.examples;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charForStep = s.charAt(i);

            if(seen.contains(charForStep)) {
                return charForStep;
            } else {
                seen.add(charForStep);
            }
        }

        return ' ';
    }
}
