//https://leetcode.com/problems/summary-ranges/description/
//Time Complexity: O(n) because we are traversing the array once
//Space Complexity: O(1) because we are using only a constant amount of space to store the result 
import java.util.ArrayList;
import java.util.List;
class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList <String> result=new ArrayList<>();
        int start=0;
        // Traverse the array and find the consecutive sequences
        while(start<nums.length)
        {
            int length=0;
            // Check for consecutive numbers starting from the current position
            while(start+length<nums.length && nums[start]+length==nums[start+length] )
            {
                length++;
            }
            // If the length of the consecutive sequence is 1, add the single number to the result, otherwise add the range in the format "start->end"  
            if(length==1)
            {
                result.add(String.valueOf(nums[start]));
            }
            // If the length of the consecutive sequence is greater than 1, add the range in the format "start->end" to the result  
            else
            {
                result.add(nums[start]+"->"+nums[start+length-1]);
            }
            start=start+length;

        }
        return result;
    }
}