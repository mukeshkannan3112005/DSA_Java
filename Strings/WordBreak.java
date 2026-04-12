package Strings;
//https://leetcode.com/problems/word-break/description/
// timecomplexity: O(n * m * k) where n is the length of the string, m is the number of words in the dictionary, and k is the average length of the words in the dictionary.
//spacecomplexity: O(n) for the dp array
//Approach: We can use dynamic programming to solve this problem. We create a boolean array dp where dp[i] indicates whether the substring s[0:i] can be segmented into words from the dictionary. We iterate through the string and for each position, we check if there is a word in the dictionary that ends at that position and if the substring before that word can be segmented (i.e., dp[start] is true). If both conditions are satisfied, we set dp[i] to true. Finally, we return dp[s.length()] which indicates whether the entire string can be segmented.    
//technique: Dynamic Programming
import java.util.List;
class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        // Iterate through the string and check for each position if there is a word in the dictionary that ends at that position   
        for (int i = 1; i <= s.length(); i++) {
            for (String w : wordDict) {
                int start = i - w.length();
                if (start >= 0 && dp[start] && s.substring(start, i).equals(w)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];        
    }
}