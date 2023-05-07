package arraysandstrings;

import java.util.Arrays;

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
