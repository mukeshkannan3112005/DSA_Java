//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
// time complexity:O(n) because we are traversing the array once to remove the duplicates
// space complexity:O(1) because we are not using any extra space to store the elements of the array    
class Remove_Duplicate2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        // we are using two pointers to remove the duplicates from the array and we are comparing the current element with the element at index j-2 because we want to keep at most two duplicates in the array 
        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}