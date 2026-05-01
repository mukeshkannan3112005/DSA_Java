package Math;
//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
// time complexity: O(n) because we are iterating through the array once to calculate the element sum and digit sum, which takes O(n) time.
// space complexity: O(1) because we are using constant space to store the element sum and digit sum.
// approach: we can use a for loop to iterate through the array and calculate the element sum and digit sum. We can use a helper function to calculate the digit sum of each element in the array. Finally, we can return the absolute difference between the element sum and digit sum.
// technique used: math, iteration
class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int element_sum=0;
        int digit_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            element_sum+=nums[i];
            digit_sum+=digitSum(nums[i]);
        }
        return Math.abs(element_sum-digit_sum);
    }
    // helper function to calculate the digit sum of a number
    public int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}