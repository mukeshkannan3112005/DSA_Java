package Strings;

//https://leetcode.com/problems/valid-anagram/description/
// time complexity: O(n)
// space complexity: O(1)
class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] character= new int[26];

        for(int i=0;i<s.length();i++){
            character[s.charAt(i)-'a']++;
            character[t.charAt(i)-'a']--;
        }
        for(int count:character){
            if(count!=0){
                return false;
            }
        }      
        return true;        
    }
}