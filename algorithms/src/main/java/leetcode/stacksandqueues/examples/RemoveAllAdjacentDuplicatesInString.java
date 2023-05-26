package leetcode.stacksandqueues.examples;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {

        StringBuilder characterStack = new StringBuilder();

        for(char c : s.toCharArray()) {

            if (characterStack.length() > 0 &&
                    characterStack.charAt(characterStack.length() - 1) == c) {
                characterStack.deleteCharAt(characterStack.length() - 1);
            } else {
                characterStack.append(c);
            }
        }

        return characterStack.toString();
    }
}
