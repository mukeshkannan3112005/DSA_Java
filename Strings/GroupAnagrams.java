package Strings;
//https://leetcode.com/problems/group-anagrams/
//Time Complexity: O(NKlogK) where N is the number of strings and K is the maximum length of a string in the array. This is because we are sorting each string which takes O(KlogK) time.
//Space Complexity: O(NK) where N is the number of strings and K is the maximum length of a string in the array. This is because we are storing all the strings in the HashMap and the output list. 
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        // Iterate through each string in the input array
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());        
    }
}