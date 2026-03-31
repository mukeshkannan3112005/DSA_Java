//https://leetcode.com/problems/minimum-size-subarray-sum/description/
//timecomplexity: O(n) as we are traversing the array once
//spacecomplexity: O(1) as we are using constant space for variables
class MinimumSizeSubarraySum{
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        // Traverse the array with the right pointer    
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink window when sum >= target
            while (sum >= target) {
                // Update minimum length of the subarray
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        // If minLen is unchanged, it means no valid subarray was found, so return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}