//lesser elements are arranged in left side of the pivot and greater elements are arranged in righter side of the pivot and both in order .
//https://leetcode.com/problems/partition-array-by-pivot/description/
// time complexity:O(n) because we are traversing the array once
// space complexity:O(n) because we are using an extra array to store the result
class   Partition_array_by_pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }
            
            if (nums[j] > pivot) {
                result[right] = nums[j];
                right--;
            }
        }
        
        while (left <= right) {
            result[left] = pivot;
            left++;
        }
        
        return result;
    }
}