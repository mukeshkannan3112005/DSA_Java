package Math;
//https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/description
//time complexity: O(n)
//space complexity: O(1)
//approach: we can use the property of XOR operation. If the XOR of all elements is non-zero, then the entire array is a valid subsequence. If the XOR is zero, we can remove one element to make it non-zero. If all elements are zero, then there is no valid subsequence.    
//technologies used: Java, Arrays, Bit Manipulation
public class LongestSubsequenceWithNonZeroBitwiseXOR {
    public int longestSubsequence(int[] nums) {
        // if there is only one element 
        if(nums.length==1 && nums[0]!=0) return 1;

        int xorValue=nums[0],zeroCount=0;

        if(nums[0]==0)
            zeroCount++;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==0) 
                zeroCount++;

            xorValue^=nums[i];
        }

        if(zeroCount==nums.length) 
            return 0;

        if(xorValue==0)
            return nums.length-1;
            
        return nums.length;
    }
}
