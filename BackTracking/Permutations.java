package BackTracking;
//https://leetcode.com/problems/permutations/description
//time complexity: O(n*n!) where n is the length of the input array
//space complexity: O(n) where n is the length of the input array
//approach: we can use backtracking to find all the possible permutations of the given array. We can use a list to store the current permutation of numbers and add it to the result list when we reach the desired length of n. We can use a for loop to iterate through the numbers in the array and call the backtracking function recursively for the next number. We can also remove the last number from the list after the recursive call to backtrack and find other permutations.
//technologies used: Java, Backtracking, List
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backTrack(res,new ArrayList<>(),nums);
        return res;
    }
    private static void backTrack(List<List<Integer>> res,List<Integer> per,int[] nums)
    {
        if(per.size()==nums.length)
        {
            res.add(new ArrayList<>(per));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(per.contains(nums[i])) continue;
            per.add(nums[i]);
            backTrack(res,per,nums);
            per.remove(per.size()-1);
        }

    }
}
