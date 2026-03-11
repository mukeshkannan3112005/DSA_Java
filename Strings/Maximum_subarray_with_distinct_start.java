//https://leetcode.com/problems/length-of-longest-substring-without-repeating-characters/description/
//time complexity: O(n)
//space complexity: O(1)
package Strings;
import java.util.HashSet;

public class Maximum_subarray_with_distinct_start {
    public int maxDistinct(String s) {
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            // we are adding the characters to the set and if the character is already present in the set then we are not adding it to the set and at the end we are returning the size of the set which is the number of distinct characters in the string
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
        }
        return set.size();
    }
}     

