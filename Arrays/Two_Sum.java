//Two sum problem solved in leetcode
//https://leetcode.com/problems/two-sum/description/
// time complexity:O(n^2) because we are using two nested loops to find the two numbers that add up to the target
// space complexity:O(1) because we are not using any extra space we are just using an array to store the result    
class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }

        }
        return res;
    }
}











