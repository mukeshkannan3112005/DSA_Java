import java.util.HashSet;
class  Set_Mistake {
    public int[] findErrorNums(int[] nums) {
        int[] result=new int[2];
        HashSet<Integer> frequency=new HashSet<Integer>();
        int total_sum=nums.length,input_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            total_sum+=i;
            if(frequency.contains(nums[i]))
            {
                result[0]=nums[i];
            }
            else{
                input_sum+=nums[i];
                frequency.add(nums[i]);
            }

        }
        result[1]=total_sum-input_sum;
        return result;
    }
}