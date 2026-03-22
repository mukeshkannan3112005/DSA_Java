//https://leetcode.com/problems/reverse-words-in-a-string/description/
// time complexity: O(n) where n is the length of the input string  
// space complexity: O(n) where n is the length of the input string
class ReverseWordInAString {
    public String reverseWords(String s) {
       StringBuilder result=new StringBuilder();
       //We first trim the input string to remove leading and trailing spaces, and then split it into an array of words using a regular expression that matches one or more whitespace characters. We then iterate through the array of words in reverse order, appending each word to a StringBuilder along with a space. Finally, we convert the StringBuilder to a string and trim any extra spaces before returning the result. 
       String[] words=s.trim().split("\\s+");
       for(int i=words.length-1;i>=0;i--)
       {
            result.append(words[i]).append(' ');
       }
       return result.toString().trim();
    }
}