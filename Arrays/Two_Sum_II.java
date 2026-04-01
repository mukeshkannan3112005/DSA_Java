//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//timecomplexity: O(n) as we are traversing the array once
//spacecomplexity: O(1) as we are using constant space for variables
class Two_Sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        // Use two pointers to find the two numbers that add up to the target
        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        // If no solution is found, return an array with -1, -1 (though the problem guarantees a solution exists)   
        return new int[]{-1, -1};       
    }
}