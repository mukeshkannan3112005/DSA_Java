//Number of good pairs problem
class Solution {
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