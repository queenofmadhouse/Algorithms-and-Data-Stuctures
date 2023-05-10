package leetcode.hashing.tasks;

/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon"
as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:

Input: text = "nlaebolko"
Output: 1

Example 2:

Input: text = "loonbalxballpoon"
Output: 2

Example 3:

Input: text = "leetcode"
Output: 0

Constraints:

1 <= text.length <= 10^4
text consists of lower case English letters only.
*/
public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char charForStep = text.charAt(i);

            if(charForStep == 'b') {
                bCount++;
            } else if (charForStep == 'a') {
                aCount++;
            } else if (charForStep == 'l') {
                lCount++;
            } else if (charForStep == 'o') {
                oCount++;
            } else if (charForStep == 'n') {
                nCount++;
            }
        }

        lCount = lCount / 2;
        oCount = oCount / 2;

        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }
}
