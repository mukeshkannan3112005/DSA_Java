//https://leetcode.com/problems/find-words-containing-a-given-character/description/
//time complexity: O(n*m) where n is the number of words and m is the average length of the words   
//space complexity: O(1) as we are not using any extra space to store the characters of the words   
package Strings;
import java.util.*; 
class Find_words_containing_character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List <Integer> result=new ArrayList<>(); 
        for(int i=0;i<words.length;i++)
        {
            if(Contains(words[i],x))
            {
                result.add(i);
            }
        }
        return result;
    }
    // we are checking if the character x is present in the word or not and if it is present then we are adding the index of the word to the result list and at the end we are returning the result list which contains the indices of the words that contain the character x
    public boolean Contains(String s,char x)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==x)
            {
                return true;
            }
        }
        return false;
    }
}

    
