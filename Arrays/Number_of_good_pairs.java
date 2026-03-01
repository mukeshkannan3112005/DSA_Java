//https://leetcode.com/problems/number-of-good-pairs/description/
// time complexity:O(n) because we are traversing the array once
// space complexity:O(1) because we are using an extra array of size 101 to store the count of elements in nums
//Number of good pairs problem
class Number_of_good_pairs {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int[] res_nums=new int[101]; //range of input is 100 so we create array of size 101
        for(int num:nums){
            res+=res_nums[num]++; //In the count of elements in nums are stored 
            //In ans the good pair are counted i.e nCr is computed n is count and r is here default 2
        }
        return res;
    }
}