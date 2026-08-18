package Strings;
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word
//time complexity: O(n*m) where n is the length of the patterns array and m is the average length of the strings in patterns
//space complexity: O(1) as we are using only a constant amount of extra space  
//approach: we can iterate through the patterns array and check if each string is a substring of the word using the contains() method. If it is, we increment the count. Finally, we return the count.  
//technologies used: Java, Strings, Arrays
class NumberofStringsThatAppearasSubstringsinWord {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String a:patterns)
        {
            if(word.contains(a))   count++;
        }
        return count;
    }
}