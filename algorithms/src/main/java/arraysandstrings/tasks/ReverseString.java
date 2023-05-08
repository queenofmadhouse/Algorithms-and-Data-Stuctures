package arraysandstrings.tasks;

    /*
    Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
     */

public class ReverseString {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char tempChar = s[left];

            s[left] = s[right];

            s[right] = tempChar;

            left++;
            right++;
        }
    }
}
