package arraysandstrings;

import java.util.Arrays;

    /*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares
    of each number sorted in non-decreasing order.

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100]
     */

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        int numsLen = nums.length;
        int[] result = new int[numsLen];

        for(int i = 0; i < numsLen; i++) {

            int valurForStep = nums[i];

            result[i] = valurForStep * valurForStep;
        }

        Arrays.sort(result);

        return result;
    }
}
