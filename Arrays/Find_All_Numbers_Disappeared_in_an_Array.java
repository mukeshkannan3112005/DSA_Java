import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// time complexity:O(n) because we are traversing the array twice once to mark the visited numbers and once to find the missing numbers
// space complexity:O(1) because we are not using any extra space we are just modifying the input array to mark the visited numbers and we are using a list to store the result which is not counted as extra space because we are returning it as output   

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark visited numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Step 2: Find missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}