//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// time complexity: O(log n) because we are using binary search to find the left and right indices of the target element in the sorted array.
// space complexity: O(1) because we are using a constant amount of space to store the result and the variables used in the binary search.
// approach: We can use binary search to find the left and right indices of the target element in the sorted array. We will perform two binary searches, one to find the left index and another to find the right index. In the first binary search, we will check if the middle element is equal to the target. If it is, we will update the index and continue searching in the left half of the array to find the leftmost occurrence of the target. In the second binary search, we will check if the middle element is equal to the target. If it is, we will update the index and continue searching in the right half of the array to find the rightmost occurrence of the target. Finally, we will return an array containing the left and right indices of the target element. If the target element is not found in the array, we will return [-1, -1].
class Find_First_and_Last_Position_of_Element_in_Sorted_Array{
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int left=binarysearch(nums,target,true);
        int right=binarysearch(nums,target,false);
        result[0]=left;
        result[1]=right;
        return result;
      
    }
    // We can use binary search to find the left and right indices of the target element in the sorted array. We will perform two binary searches, one to find the left index and another to find the right index. In the first binary search, we will check if the middle element is equal to the target. If it is, we will update the index and continue searching in the left half of the array to find the leftmost occurrence of the target. In the second binary search, we will check if the middle element is equal to the target. If it is, we will update the index and continue searching in the right half of the array to find the rightmost occurrence of the target. Finally, we will return an array containing the left and right indices of the target element. If the target element is not found in the array, we will return [-1, -1]. 
    public static int binarysearch(int[] nums, int target,boolean isleftsearch)
    {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right)
        {
            int mid=(right+left)/2;
            if(nums[mid]==target)
            {
                index=mid;
                if(isleftsearch)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return index;
    }
}