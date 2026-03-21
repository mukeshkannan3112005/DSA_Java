//https://leetcode.com/problems/integer-to-roman/description
// time complexity: O(n)
// space complexity: O(1)
class IntegerToRoman {
    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        //We iterate through the values array, and for each value, we check if the input number is greater than or equal to that value. If it is, we append the corresponding symbol to the StringBuilder and subtract the value from the input number. We repeat this process until the input number becomes zero, at which point we have constructed the Roman numeral representation of the original integer. Finally, we return the resulting string.   
        for (int i = 0; i < values.length; ++i) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();        
    }
}