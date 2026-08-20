//https://leetcode.com/problems/maximum-sum-circular-subarray/description/
//time complexity: O(n) where n is the length of the input array
//space complexity: O(1) because we are using constant space to store the variables
//approach: we can use a modified version of Kadane's algorithm to find the maximum subarray sum in a circular array. We can find the maximum subarray sum in the non-circular case using Kadane's algorithm and also find the minimum subarray sum using a similar approach. The maximum subarray sum in the circular case can be found by subtracting the minimum subarray sum from the total sum of the array. Finally, we return the maximum of the two sums. If all numbers are negative, we return the maximum number in the array.   
//technologies used: Java, Kadane's algorithm
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0,currMax=0,maxSum=nums[0],currMin=0,minSum=nums[0];
        for (int n:nums) {

            currMax=Math.max(currMax+n,n);
            maxSum=Math.max(maxSum,currMax);
            currMin=Math.min(currMin+n,n);
            minSum=Math.min(currMin,minSum);
            total+=n; 
        }
        return maxSum>0 ? Math.max(maxSum,total-minSum):maxSum;
    }
}
