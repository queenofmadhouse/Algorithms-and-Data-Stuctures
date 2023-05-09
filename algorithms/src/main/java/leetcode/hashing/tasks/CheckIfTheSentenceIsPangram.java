package leetcode.hashing.tasks;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {

        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);

            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        return true;
    }
}
