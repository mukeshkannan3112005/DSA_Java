//https://leetcode.com/problems/valid-palindrome/description/
//time complexity: O(n) where n is the length of the input string as we are traversing the input string once to remove all non-alphanumeric characters and convert it to lowercase and then we are traversing the cleaned string from both ends to check for palindrome which takes O(n) time in the worst case when the cleaned string is a palindrome
//space complexity: O(n) as we are creating a new string to store the cleaned version   
package Strings;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // we are traversing the input string once to remove all non-alphanumeric characters and convert it to lowercase and then we are traversing the cleaned string from both ends to check for palindrome which takes O(n) time in the worst case when the cleaned string is a palindrome and we are comparing the characters at the left and right indices and if they are not equal we are returning false and if they are equal we are moving the left index to the right and the right index to the left and at the end if we have traversed the entire cleaned string without finding any mismatch we are returning true as it is a palindrome 
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
