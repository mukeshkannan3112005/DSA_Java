//https://leetcode.com/problems/find-peak-element/description/
// time complexity:O(log n) because we are using binary search to find the peak element in the array and we are dividing the array into two halves in each iteration of the while loop  
// space complexity:O(1) because we are not using any extra space to store the elements of the array and we are using only two variables to store the left and right pointers of the binary search algorithm    
// we are using binary search to find the peak element in the array and we are dividing the array into two halves in each iteration of the while loop and we are checking if the middle element is greater than the next element then we are updating the right pointer to the middle index because the peak element must be in the left half of the array and if the middle element is less than or equal to the next element then we are updating the left pointer to the middle index plus one because the peak element must be in the right half of the array and we are doing this until we find the peak element which is when left pointer is equal to right pointer and we are returning the left pointer as the index of the peak element in the array 
// technique used: binary search because we are dividing the array into two halves in each iteration of the while loop and we are checking if the middle element is greater than the next element then we are updating the right pointer to the middle index because the peak element must be in the left half of the array and if the middle element is less than or equal to the next element then we are updating the left pointer to the middle index plus one because the peak element must be in the right half of the array and we are doing this until we find the peak element which is when left pointer is equal to right pointer and we are returning the left pointer as the index of the peak element in the array    
class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // we are using binary search to find the peak element in the array and we are dividing the array into two halves in each iteration of the while loop and we are checking if the middle element is greater than the next element then we are updating the right pointer to the middle index because the peak element must be in the left half of the array and if the middle element is less than or equal to the next element then we are updating the left pointer to the middle index plus one because the peak element must be in the right half of the array and we are doing this until we find the peak element which is when left pointer is equal to right pointer and we are returning the left pointer as the index of the peak element in the array f
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;        
    }
}