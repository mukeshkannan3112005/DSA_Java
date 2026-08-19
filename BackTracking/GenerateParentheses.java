package BackTracking;
//https://leetcode.com/problems/generate-parentheses/description
//time complexity: O(4^n/sqrt(n)) where n is the number of pairs of parentheses
//space complexity: O(n) where n is the number of pairs of parentheses
//approach: we can use backtracking to find all the possible combinations of well-formed parentheses. We can use a StringBuilder to store the current combination of parentheses and add it to the result list when we reach the desired length of n*2. We can use two variables to keep track of the number of open and close parentheses used so far. We can use a for loop to iterate through the number of pairs of parentheses and call the backtracking function recursively for the next pair. We can also remove the last parenthesis from the StringBuilder after the recursive call to backtrack and find other combinations.
//technologies used: Java, Backtracking, StringBuilder
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        if(n==0) return res;
        backTrack(n,res,new StringBuilder(),0,0);
        return res;
    }
    private static void backTrack(int n,List<String> res,StringBuilder comb,int open,int close)
    {
        if(comb.length()==n*2)
        {
            res.add(comb.toString());
            return;
        }
        if(open<n)
        {
            comb.append('(');
            backTrack(n,res,comb,open+1,close);
            comb.deleteCharAt(comb.length()-1);
        }
        if(close<open)
        {
            comb.append(')');
            backTrack(n,res,comb,open,close+1);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}
