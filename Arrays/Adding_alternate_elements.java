//https://leetcode.com/problems/find-the-alternating-sum-of-an-array/description
// time complexity:O(n)
// space complexity:O(1)
// Compute alternating sum problem
class Adding_alternate_elements {
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
