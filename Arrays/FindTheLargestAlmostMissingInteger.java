//https://leetcode.com/problems/find-the-largest-almost-missing-integer/description/
//time complexity: O(n)
//space complexity: O(1) since the frequency array has a fixed size of 51   
//approach: we can use a frequency array to count the occurrences of each integer in the input array. Then, we can iterate through the input array and check if the current integer is an "almost missing" integer based on the given conditions. If it is, we update the result with the maximum value found so far. Finally, we return the result.    
//technologies used: Java, Arrays, Frequency Array
public class FindTheLargestAlmostMissingInteger {
     public int largestInteger(int[] nums, int k) {
        int[] freq=new int[51];
        // Count the frequency of each integer in the input array
        for(int i:nums)
        {
            freq[i]++;
        }
        int result=-1,n=nums.length;
        for(int i=0;i<n;i++)
        {
            // Check if the current integer is an "almost missing" integer based on the given conditions    
            if(k==n || (freq[nums[i]]==1 && (k==1 || i==0 || i==n-1)))
            {
                result=Math.max(result,nums[i]);
            }
        }
        return result;
    }
}
