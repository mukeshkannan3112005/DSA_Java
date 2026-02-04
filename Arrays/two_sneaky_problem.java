//the two sneaky numbers of digitville problem
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] sneaky_nums=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);   //storing the elements with the corresponding index in hashmap
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])!=i)
            {
                sneaky_nums[k++]=nums[i]; //while adding in hashmap the duplicate values will have different index value 
            }
        }

        return sneaky_nums;
    }
}