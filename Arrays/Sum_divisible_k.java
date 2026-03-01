//To find sum of the array and reduce the array elements to get the sum which is divisible by k.
//https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/
// time complexity:O(n) because we are traversing the array once
// space complexity:O(1) because we are not using any extra space we are just modifying the input array
class Sum_divisible_k {
    public int minOperations(int[] nums, int k) {
        //find sum for elements of the array
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        //finding remainder when divided by k
        if(sum<k)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=0;
            }
            return sum;
        }
        else{
             int rem=sum%k;
             if(rem==0) //if the sum is divisible by k
             {
                return 0;
             }
             for(int i=0;i<nums.length;i++)//reducing the value in the array
             {
                if(nums[i]>rem)
                {
                    nums[i]=nums[i]-rem;
                }
             }
             return rem;
        }
        
    }
}