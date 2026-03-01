//problem link: https://leetcode.com/problems/shuffle-the-array/description/
// time complexity:O(n) because we are traversing the array once
// space complexity:O(n) because we are using an extra array to store the result
class Shuffle_the_array {
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