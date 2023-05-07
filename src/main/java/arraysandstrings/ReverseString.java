package arraysandstrings;

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
