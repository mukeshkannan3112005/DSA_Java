//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// time complexity:O(log n) because we are using binary search to find the target element   
// space complexity:O(1) because we are not using any extra space to store the elements of the array and we are using only two variables to store the left and right pointers of the binary search algorithm
// we are using binary search to find the target element in the array and we are dividing the array into two halves in each iteration of the while loop and we are checking if the middle element is greater than or equal to the left element then we are checking if the target element is between the left element and the middle element then we are updating the right pointer to the middle index minus one because the target element must be in the left half of the array and if the target element is not between the left element and the middle element then we are updating the left pointer to the middle index plus one because the target element must be in the right half of the array and if the middle element is less than the left element then we are checking if the target element is between the middle element and the right element then we are updating the left pointer to the middle index plus one because the target element must be in the right half of the array and if the target element is not between the middle element and the right element then we are updating the right pointer to the middle index minus one because the target element must be in the left half of the array and we are doing this until we find the target element which is when nums[mid] is equal to target and we are returning mid as the index of the target element in the array and if we do not find the target element in the array then we are returning -1  
// technique used: binary search because we are dividing the array into two halves in each iteration of the while loop and we are checking if the middle element is greater than or equal to the left element then we are checking if the target element is between the left element and the middle element then we are updating the right pointer to the middle index minus one because the target element must be in the left half of the array and if the target element is not between the left element and the middle element then we are updating the left pointer to the middle index plus one because the target element must be in the right half of the array and if the middle element is less than the left element then we are checking if the target element is between the middle element and the right element then we are updating the left pointer to the middle index plus one because the target element must be in the right half of the array and if the target element is not between the middle element and the right element then we are updating the right pointer to the middle index minus one because the target element must be in the left half of the array and we are doing this until we find the target element which is when nums[mid] is equal to target and we are returning mid as the index of the target element in the array and if we do not find the target element in the array then we are returning -1   
class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;        
    }
}