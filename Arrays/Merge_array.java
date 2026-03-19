//https://leetcode.com/problems/merge-sorted-array/description/
// time complexity:O(m+n) because we are traversing both the arrays once   
// space complexity:O(1) because we are not using any extra space to store the elements of the array    
class Merge_array{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        // we are starting from the end of both the arrays and comparing the elements and adding the greater element to the end of the first array  
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}