package Strings;
//https://leetcode.com/problems/is-subsequence/description/
//Time Complexity: O(n) because we are traversing the string t once
//Space Complexity: O(1) because we are using only a constant amount of space
class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        // Traverse both strings until we reach the end of t
        while(j<t.length() && i<s.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        // If we have traversed the entire string s, then it is a subsequence of t
        return i==s.length()?true:false;
    }
}