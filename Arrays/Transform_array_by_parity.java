//https://leetcode.com/problems/transform-array-by-parity/description/
// time complexity:O(n) because we are traversing the array twice
// space complexity:O(1) because we are not using any extra space we are just modifying the input array
//Transform Array by parity problem
class Transform_array_by_parity {
    public int[] transformArray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                count++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count>0)
            {
                nums[i]=0;
                count--;
            }
            else
            {
                nums[i]=1;
            }
        }
        return nums;
    }
}