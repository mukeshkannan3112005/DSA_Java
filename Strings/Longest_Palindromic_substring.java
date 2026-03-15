//https://leetcode.com/problems/longest-palindromic-substring/description/
//time complexity: O(n^2) where n is the length of the input string as we are traversing the input string and for each character we are expanding around the center to find the longest palindrome which takes O(n) time in the worst case      
//space complexity: O(1) as we are using only constant extra space to store the start and end indices of the longest palindrome and the result string is also not counted as extra space as it is returned as output and not stored in any variable     

package Strings;
class Longest_Palindromic_substring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // we are traversing the input string and for each character we are expanding around the center to find the longest palindrome which takes O(n) time in the worst case and we are comparing the length of the odd and even length palindromes and updating the start and end indices of the longest palindrome found so far and at the end we are returning the longest palindrome substring using the start and end indices        
            int odd = expandAroundCenter(s, i, i);
            // we are traversing the input string and for each character we are expanding around the center to find the longest palindrome which takes O(n) time in the worst case and we are comparing the length of the odd and even length palindromes and updating the start and end indices of the longest palindrome found so far and at the end we are returning the longest palindrome substring using the start and end indices    
            int even = expandAroundCenter(s, i, i + 1);
            int max_len = Math.max(odd, even);

            if (max_len > end - start) {
                start = i - (max_len - 1) / 2;
                end = i + max_len / 2;
            }
        }

        return s.substring(start, end + 1);        
    }
    // we are expanding around the center to find the longest palindrome which takes O(n) time in the worst case and we are comparing the characters at the left and right indices and if they are equal we are moving the left index to the left and the right index to the right and at the end we are returning the length of the longest palindrome found by subtracting the left index from the right index and subtracting 1 to account for the extra increment of both indices in the last iteration of the while loop when they are not equal       
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }    
}