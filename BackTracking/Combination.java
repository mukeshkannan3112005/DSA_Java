package BackTracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/description
//time complexity: O(n choose k) where n is the length of the input array and k is the number of elements to choose
//space complexity: O(k) where k is the number of elements to choose
//approach: we can use backtracking to find all the possible combinations of k numbers from the range [1, n]. We can use a list to store the current combination of numbers and add it to the result list when we reach the desired length of k. We can use a for loop to iterate through the numbers from 1 to n and call the backtracking function recursively for the next number. We can also remove the last number from the list after the recursive call to backtrack and find other combinations.
//technologies used: Java, Backtracking, List
public class Combination{
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backTracking(n,k,1,res,new ArrayList<>());
        return res;
    }
    private static void backTracking(int n,int k,int idx,List<List<Integer>>res,List<Integer> comb)
    {
        if(comb.size()==k)
        {
            res.add(new ArrayList<>(comb));
            return;
        }
        for(int i=idx;i<=n;i++)
        {
            comb.add(i);
            backTracking(n,k,i+1,res,comb);
            comb.remove(comb.size()-1);
        }
    }
}