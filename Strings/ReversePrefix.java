//https://leetcode.com/problems/reverse-prefix-of-word/description/
//time complexity: O(k) where k is the value of the input parameter k as we are iterating through the first k characters of the input string s and reversing them
//space complexity: O(n) where n is the length of the input string s as we are creating a new character array of the same length as the input string s to store the characters of the input string s and then we are reversing the first k characters of the character array and at the end we are converting the character array back to a string and returning it
package Strings;
class ReversePrefix {
    public String reversePrefix(String s, int k) {
        if(k==1) return s;
        char[] arr=s.toCharArray();
        // we are iterating through the first k characters of the character array and reversing them by swapping the characters at the start and end of the first k characters until we reach the middle of the first k characters and at the end we are converting the character array back to a string and returning it       
        for(int i=0,j=k-1;i<j;i++,j--)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return new String(arr);
    }
}