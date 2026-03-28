//https://leetcode.com/problems/longest-consecutive-sequence/description/
//Time Complexity: O(n) because we are traversing the array once and each element is processed at most twice (once when we add it to the set and once when we check for consecutive numbers)
//Space Complexity: O(n) because we are using a set to store the unique elements of the array
package Strings;
import java.util.HashSet;
import java.util.Set;
class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        // Add all numbers to the set for O(1) lookups
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;
        // Iterate through the set and check for the longest consecutive sequence
        for (int num : numSet) {
            // Only start counting if num is the start of a sequence (i.e., num - 1 is not in the set)  
            if (!numSet.contains(num - 1)) {
                int length = 1;
                // Count the length of the consecutive sequence starting from num   
                while (numSet.contains(num + length)) {
                    length++;
                }
                // Update the longest length found so far
                longest = Math.max(longest, length);
            }
        }

        return longest;        
    }
}