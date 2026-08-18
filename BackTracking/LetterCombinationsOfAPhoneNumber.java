package BackTracking;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description
//time complexity: O(4^n) where n is the length of the digits string
//space complexity: O(n) where n is the length of the digits string 
//approach: we can use backtracking to find all the possible combinations of letters for the given digits. We can use a hashmap to store the digits and its corresponding letters. We can use a StringBuilder to store the current combination of letters and add it to the result list when we reach the end of the digits string. We can use a for loop to iterate through the letters for each digit and call the backtracking function recursively for the next digit. We can also remove the last letter from the StringBuilder after the recursive call to backtrack and find other combinations.
//technologies used: Java, Backtracking, HashMap, StringBuilder
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();

        //if digits is empty return empty list
        if(digits==null || digits.length()==0)
        {
            return res;
        }

        //Storing the digits and its corresponding letters
        HashMap<Character,String> digitLetters=new HashMap<>();
        digitLetters.put('2',"abc");
        digitLetters.put('3',"def");
        digitLetters.put('4',"ghi");
        digitLetters.put('5',"jkl");
        digitLetters.put('6',"mno");
        digitLetters.put('7',"pqrs");
        digitLetters.put('8',"tuv");
        digitLetters.put('9',"wxyz");

        //initial back tracking starts here with the index 0
        backTrack(digits,0,res,new StringBuilder(),digitLetters);
        return res;
    }
    private static void backTrack(String digits,int idx,List<String> res,StringBuilder comb,HashMap<Character,String> digitLetters)
    {
        // return if the index out of the digits length add the string in the result
        if(idx==digits.length())
        {
            res.add(comb.toString());
            return;
        }

        String letters=digitLetters.get(digits.charAt(idx));
        //Iterating the letters for all possible combination 
        for(char ch:letters.toCharArray())
        {
            comb.append(ch);
            //back tracking for finding combinations in the strings 
            backTrack(digits,idx+1,res,comb,digitLetters);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}
