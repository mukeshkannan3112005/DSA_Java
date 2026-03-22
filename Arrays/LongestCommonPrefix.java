//https://leetcode.com/problems/longest-common-prefix/description/
// time complexity: O(n*m) where n is the number of strings and m is the length of the longest common prefix
// space complexity: O(1)   
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String pref = strs[0];
        int prefLen = pref.length();
        //We initialize the longest common prefix as the first string in the array and its length as the initial prefix length. We then iterate through the remaining strings in the array, comparing each string with the current longest common prefix. If the current string does not start with the longest common prefix, we reduce the prefix length by one and update the longest common prefix accordingly. We repeat this process until we find a common prefix that is a prefix of all strings or until we reduce the prefix length to zero, in which case we return an empty string. Finally, we return the longest common prefix found. 
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;        
    }
}