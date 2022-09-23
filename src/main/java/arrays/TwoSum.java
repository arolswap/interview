package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] location = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(target - nums[i])) {
                location[0] = nums[i];
                location[1] = target - nums[i];
            }
        }

        for (int i : location) {
            System.out.println(i);
        }
        return location;
    }

    public static void main(String[] args) {
        int[] nums = {2,12,7,15};
        int target = 9;
        new TwoSum().twoSum(nums, target);


    }
}
