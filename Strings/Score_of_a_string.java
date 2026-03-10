//https://leetcode.com/problems/score-of-a-string/description/
package Strings;
// time complexity: O(n)
// space complexity: O(1)
class Score_of_a_string {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            // we are calculating the absolute difference of the position of the characters in the alphabet and adding it to the sum 
            sum+=Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a'));
        }
        return sum;
    }
}