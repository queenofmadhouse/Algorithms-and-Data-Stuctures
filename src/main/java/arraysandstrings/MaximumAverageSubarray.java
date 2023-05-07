package arraysandstrings;

    /*
    Example 1:
        Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

    Example 2:
        Input: nums = [5], k = 1
        Output: 5.00000

    Note: In this problem, we have a fixed window size k, so we can use a trick and not calculate
    the value between the start and end of the window.
     */

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {

        if (k < 1) {
            return nums[0];
        }

        double curr = 0;

        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        double ans = curr;

        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];

            ans = Math.max(ans, curr);
        }
        return ans / k;
    }
}
