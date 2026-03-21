//https://leetcode.com/problems/roman-to-integer/description
// time complexity: O(n)
// space complexity: O(1)
import java.util.HashMap;
import java.util.Map;
class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        //We iterate through the input string, and for each character, we compare its corresponding value with the value of the next character. If the current character's value is less than the next character's value, it means that we need to subtract the current character's value from the result. Otherwise, we add the current character's value to the result. Finally, we add the value of the last character to the result and return it as the final integer representation of the Roman numeral. 
        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));        
    }
}