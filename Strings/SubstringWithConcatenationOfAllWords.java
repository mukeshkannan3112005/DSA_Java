package Strings;
// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
// timecomplexity: O(N * M) where N is the length of the string s and M is the number of words in the array words. This is because we are iterating through the string s and for each starting point, we are checking for the presence of the words in the array.
// spacecomplexity: O(M) where M is the number of words in the array words. This is because we are using a HashMap to store the count of each word in the array, and in the worst case, all words could be unique, leading to a space complexity of O(M).
// The SubstringWithConcatenationOfAllWords class contains a method findSubstring that takes a string s and an array of strings words as input and returns a list of integers representing the starting indices of substrings in s that are a concatenation of all the words in the array. The method first checks for edge cases where the input is empty. It then creates a HashMap to count the occurrences of each word in the array. The method uses a sliding window approach to check for valid substrings in s, adjusting the window size based on the length of the words and ensuring that the count of each word matches the original count from the HashMap. If a valid substring is found, its starting index is added to the result list.
// approach: We use a sliding window approach to check for valid substrings in s. We iterate through the string s with different offsets based on the length of the words. For each offset, we maintain a current count of the words found in the current window and adjust the window size accordingly. If we find a valid substring that matches the count of words in the original HashMap, we add its starting index to the result list.
// technique: Sliding window, HashMap
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        if (words.length == 0 || s.length() == 0) {
            return ans;
        }

        int wordSize = words[0].length();
        int wordCount = words.length;
        int N = s.length();
        // We create a HashMap to count the occurrences of each word in the array words. This allows us to easily check if a substring in s matches the required count of each word when we are checking for valid substrings. The HashMap stores each word as a key and its corresponding count as the value, which helps us manage the counts efficiently during our sliding window approach. 
        HashMap<String,Integer> originalCount = new HashMap<>();
        for(int i = 0; i<wordCount; i++){
            originalCount.put(words[i], originalCount.getOrDefault(words[i],0)+1);
        }
        // We iterate through the string s with different offsets based on the length of the words. For each offset, we maintain a current count of the words found in the current window and adjust the window size accordingly. If we find a valid substring that matches the count of words in the original HashMap, we add its starting index to the result list. This approach allows us to efficiently check for valid substrings while ensuring that we are considering all possible starting points in s that could lead to a valid concatenation of the words. 
        for(int offset = 0; offset<wordSize; offset++){
            HashMap<String,Integer> currentCount = new HashMap<>();
            int start = offset;
            int count = 0;
            // We use a while loop to move through the string s in increments of the word size, checking for valid substrings. Inside the loop, we extract the current word from s and check if it exists in the original HashMap. If it does, we update our current count and check if it exceeds the required count. If it does, we adjust our window by moving the start pointer and updating the counts accordingly. If we find a valid substring that matches the required count of words, we add its starting index to our result list. If the current word is not in the original HashMap, we reset our counts and move the start pointer to the next position after the current word. This process continues until we have checked all possible starting points in s for valid substrings.  
            for(int end = offset; end + wordSize <= N; end += wordSize){
                String currWord = s.substring(end, end + wordSize);
                if(originalCount.containsKey(currWord)){
                    currentCount.put(currWord, currentCount.getOrDefault(currWord,0)+1);
                    count++;
                    // We check if the current count of the word exceeds the required count from the original HashMap. If it does, we need to adjust our window by moving the start pointer and updating the counts accordingly. We do this in a while loop that continues until the current count of the word is no longer greater than the required count. Inside the loop, we extract the word at the start pointer, decrement its count in the current HashMap, and move the start pointer to the right by one word size. We also decrement our count of valid words found in the current window. This process ensures that we maintain a valid window of words that matches the required counts from the original HashMap. 
                    while(currentCount.get(currWord)>originalCount.get(currWord)){
                        String startWord = s.substring(start,start+wordSize);
                        currentCount.put(startWord, currentCount.get(startWord)-1);
                        start+=wordSize;
                        count--;                        
                    }

                    if(count == wordCount){
                        ans.add(start);
                    }
                    
                }
                else{
                    count = 0;
                    start = end + wordSize;
                    currentCount.clear();
                }
            }

        }
        return ans;
    }
}