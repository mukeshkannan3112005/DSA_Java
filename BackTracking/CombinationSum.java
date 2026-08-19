package BackTracking;
//https://leetcode.com/problems/combination-sum/description
//time complexity: O(2^n) where n is the length of the input array
//space complexity: O(n) where n is the length of the input array
//approach: we can use backtracking to find all the possible combinations of numbers that sum up to the target. We can use a list to store the current combination of numbers and add it to the result list when we reach the target. We can use a for loop to iterate through the numbers in the array and call the backtracking function recursively for the next number. We can also remove the last number from the list after the recursive call to backtrack and find other combinations.
//technologies used: Java, Backtracking, List
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backTrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    private static void backTrack(List<List<Integer>> res,List<Integer> per,int[] nums,int target,int idx)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(per));
            return;
        }
        if(target<0)
        {
            return;
        }
        if(target>0)
        {
            for(int i=idx;i<nums.length;i++)
            {
                per.add(nums[i]);
                backTrack(res,per,nums,target-nums[i],i);
                per.remove(per.size()-1);
            }
        }

    }
}
