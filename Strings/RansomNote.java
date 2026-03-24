package Strings;
//https://leetcode.com/problems/ransom-note/description/
// time complexity: O(n) because we are traversing the magazine and ransomNote strings once each      
// space complexity: O(1) because we are using a fixed-size array of length 26 to count the characters  
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        // Check if the ransom note can be constructed from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }
}