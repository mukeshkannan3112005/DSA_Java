//https://leetcode.com/problems/jewels-and-stones/description/
//time complexity: O(j + s) where j is the length of the jewels string and s is the length of the stones string 
//space complexity: O(j) where j is the length of the jewels string as we are using a set to store the characters of the jewels string  
package Strings;
import java.util.HashSet;
import java.util.Set;

public class Jewels_and_stones{
   public int numJewelsInStones(String jewels, String stones) {
    Set<Character> jewelSet = new HashSet<>();
    // we are adding the characters of the jewels string to the set and then we are checking if the characters of the stones string are present in the set or not and if they are present then we are counting them and at the end we are returning the count of the jewels that are present in the stones string
    for (char j : jewels.toCharArray()) jewelSet.add(j);

    int count = 0;
    // we are iterating through the characters of the stones string and checking if they are present in the jewelSet or not and if they are present then we are incrementing the count variable and at the end we are returning the count variable which contains the number of jewels that are present in the stones string    
    for (char s : stones.toCharArray()) {
        if (jewelSet.contains(s)) count++;
    }
    return count;
    }
} 
    

