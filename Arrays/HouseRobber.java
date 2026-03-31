//https://leetcode.com/problems/house-robber/description/
//timecomplexity: O(n) as we are traversing the array once
//spacecomplexity: O(1) as we are using constant space for variables
class HouseRobber {
    public int rob(int[] nums) {
        // prev1 represents the maximum amount that can be robbed up to the previous house
        // prev2 represents the maximum amount that can be robbed up to the house before the previous house
        int prev1=0,prev2=0;
        for(int num:nums)
        {
            // Calculate the maximum amount that can be robbed at the current house
            int temp=Math.max(prev1,num+prev2);
            // Update prev2 to be the previous prev1 and prev1 to be the current maximum
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}
