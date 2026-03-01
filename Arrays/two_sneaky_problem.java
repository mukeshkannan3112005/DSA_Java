//the two sneaky numbers of digitville problem
//https://leetcode.com/problems/two-sneaky-numbers-of-digitville/description/
// time complexity:O(n) because we are traversing the array once to store the elements in hashmap and once to find the sneaky numbers
// space complexity:O(n) because we are using a hashmap to store the elements of the array and an array to store the sneaky numbers
import java.util.HashMap;
class  two_sneaky_problem {
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