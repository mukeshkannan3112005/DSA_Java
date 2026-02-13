https://leetcode.com/problems/left-and-right-sum-differences/description/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left_arr=new int[nums.length];
        int[] right_arr=new int[nums.length];
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++) //finding the left and right sum of the array
        {
            left_arr[i]=sum1;
            sum1+=nums[i];
            right_arr[nums.length-1-i]=sum2;
            sum2+=nums[nums.length-1-i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=left_arr[i]>right_arr[i]?left_arr[i]-right_arr[i]:right_arr[i]-left_arr[i]; //subtracting the left and right sum
        }
        return nums;
    }
}