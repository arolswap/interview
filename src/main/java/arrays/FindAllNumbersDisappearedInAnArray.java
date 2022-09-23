package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
      //  List list =  new ArrayList<Integer>((Arrays.sort(nums)));


     /*   for(int i =1; i<=nums.length ; i++){
            if(list.contains(nums[i])){
                list.removeAll(Arrays.asList(nums[i]));

            }
        }*/

        return null;
    }

}
