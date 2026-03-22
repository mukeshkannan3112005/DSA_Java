package Strings;
//https://leetcode.com/problems/implement-strstr/
// time complexity: O(n*m) where n is the length of the haystack and m is the length of the needle
// space complexity: O(1) as we are using only a constant amount of extra space
public class FirstOccurrenceIndex {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) return -1;
        //We iterate through the haystack string from index 0 to n - m (inclusive) to ensure that we have enough characters left in the haystack to match the needle. For each index i, we initialize a count variable to keep track of how many characters of the needle match with the corresponding characters in the haystack. We use a while loop to compare characters of the haystack and needle until we either find a mismatch or successfully match all characters of the needle. If we successfully match all characters (count == m), we return the starting index i. If we finish iterating through the haystack without finding a match, we return -1.    
        for (int i = 0; i <= n - m; i++) {
            int count = 0;

            while (count < m && haystack.charAt(i + count) == needle.charAt(count)) {
                count++;
            }

            if (count == m) {
                return i;
            }
        }
        return -1;
    }
}