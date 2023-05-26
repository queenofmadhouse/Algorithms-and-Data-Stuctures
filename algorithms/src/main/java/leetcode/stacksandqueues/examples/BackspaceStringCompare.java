package leetcode.stacksandqueues.examples;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String string) {
        StringBuilder stack = new StringBuilder();

        for(char c : string.toCharArray()) {
            if (c != '#') {
                stack.append(c);
            } else if (stack.length() > 0) {
                stack.deleteCharAt(stack.length() - 1);
            }
        }

        return stack.toString();
    }
}
