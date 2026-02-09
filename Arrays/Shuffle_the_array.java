//problem link: https://leetcode.com/problems/shuffle-the-array/description/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[2*n];
        int k=0,j=n;
        for(int i=0;i<n;i++)//runs the loop only for O(n) not O(2*n)
        {
            result[k++]=nums[i]; //odd index are filled with first n elements 
            result[k++]=nums[j++];//even index are filled with second n elements
        }
        return result;
    }
}