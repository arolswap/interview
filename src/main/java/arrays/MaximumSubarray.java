package arrays;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 */
public class MaximumSubarray {

    //using DP - Kadane's algorithm Time complexity O(n)
    public static int maxSubArray(int[] nums) {
        int maxSubarray = nums[0];
        int currentSubarray = nums[0];


        return maxSubarray;
    }


    public static void main(String[] args) {
        int[] nums = {1, -2, 4, 1};

        System.out.println(maxSubArray(nums));
    }
}
