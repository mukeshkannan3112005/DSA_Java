// Compute alternating sum problem
class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        if(nums.length==1) // if array contains only one element
        {
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2)//subtracting continuous elements and adding alternating elements here
        {
            sum+=nums[i]-nums[i+1];
        }
        if(nums.length%2!=0){  //if lenght is odd add the last element at last
            sum+=nums[nums.length-1];
        }
        
        return sum;
    }
}