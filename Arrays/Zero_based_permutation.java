//https://leetcode.com/problems/build-array-from-permutation/description/
// time complexity:O(n) because we are traversing the array twice
// space complexity:O(1) because we are not using any extra space we are just modifying the input array
/*consider if nums[1]=2 and nums[2]=1 the first take modulo of nums[nums[i]] with 1001 a maximum array size 
then multiply with 1001 and add with nums[i] in this example we get nums[1]=1003 next step find modulo of nums[nums[i]] with 1001 
we get the value 2 next 1001*2=2002+1=2003 like this do for all elements in the array after that divide the values with 1001 to get the original value */
class Zero_based_permutation {
    public int[] buildArray(int[] nums) {
     //find zero-based permutation for each element in the array
    for(int i=0;i<nums.length;i++)
    {
        nums[i]+=(1001*(nums[nums[i]]%1001)); 
    }
    for(int i=0;i<nums.length;i++)
    {
        nums[i]/=1001;
    }
    return nums;
    }
}