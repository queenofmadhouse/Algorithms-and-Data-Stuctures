package leetcode.stacksandqueues.tasks;

import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");


        for (String directory : components) {

            if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!directory.equals(".") && !directory.isEmpty()) {
                stack.add(directory);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}
