package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //method one - time complexity is O(nlogn)
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // O(nlogn)
        for (int i = 0; i <= nums.length - 2; i++) {     //O(n)
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //method two - using Set - time complexity O(n)
    public static boolean containsDuplicate2(int[] nums) {
        Set set = new HashSet(nums.length);// O(n)
        for (int x : nums) {
            if (set.contains(x)) {
                return true;
            }else{
                set.add(x);
            }
        }


        return false;
    }

    public static void main(String[] args) {
        // Test cases

        //int[] nums = {1, 2, 4, 5, 3, 14, 15, 7, 33, 8, 6};
        //int[] nums = {1, 2, 4, 5, 1, 2, 4, 5};
        int[] nums = {1, 2, 4, 1};

        System.out.println(containsDuplicate2(nums));
    }
}


