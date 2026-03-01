//concatenation of same array
class Concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[nums.length*2];
        for(int i=0;i<nums.length*2;i++)
        {
            ans[i]=nums[i%nums.length]; // here modulo operator is used to repeat the array to concatenate
        }
        return ans;
    }
}