package Strings;
//https://leetcode.com/problems/longest-repeating-character-replacement/    
//time complexity: O(n) where n is the length of the input string s
//space complexity: O(1) since the frequency array has a fixed size of 26   
//approach: we can use a sliding window approach to keep track of the frequency of characters in the current window. We maintain a frequency array to count the occurrences of each character in the window. We also keep track of the maximum frequency of any character in the window. If the size of the window minus the maximum frequency is greater than k, we shrink the window from the left. We update the maximum length of the valid window as we iterate through the string. Finally, we return the maximum length found.
//technologies used: Java, Strings, Sliding Window, Frequency Array
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int n=s.length(),maxLength=0,maxFreq=0;
        int left=0,right=0;
        while(right<n)
        {
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);

            int windowSize=right-left+1;

            if(windowSize-maxFreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength=Math.max(maxLength,right-left+1);
            right++;

        }
        return maxLength;
    }
}
