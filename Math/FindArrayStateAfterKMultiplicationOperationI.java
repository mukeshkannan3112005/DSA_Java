package Math;
//https://leetcode.com/problems/find-array-state-after-k-multiplication-operation-i/description/    
// time complexity: O(k*n) where k is the number of operations and n is the length of the array.
// space complexity: O(1) because we are modifying the input array in place.
// approach: we can simply iterate through the array k times and in each iteration we can find the smallest element in the array and multiply it with the multiplier. We can find the smallest element in the array by iterating through the array and comparing each element with the smallest element found so far. Finally, we will get the final state of the array after k operations. 
// technique used: math
class FindArrayStateAfterKMultiplicationOperationI{
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++)
        {
            int index=findSmallest(nums);
            nums[index]*=multiplier;
        }
        return nums;
    }
    // helper function to find the index of the smallest element in the array
    public int findSmallest(int[] nums)
    {
        int smallest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<nums[smallest])
            {
                smallest=i;
            }
        }
        return smallest;
    }
}
