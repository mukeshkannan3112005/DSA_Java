//https://leetcode.com/problems/add-binary/description/
// timecomplexity: O(max(n, m)) where n and m are the lengths of the input strings a and b respectively.
//spacecomplexity: O(max(n, m)) for the StringBuilder used to construct the result string.  
//Approach: We can use two pointers to iterate through the input strings from the end to the beginning. We also maintain a carry variable to keep track of any carry that may occur during the addition. For each pair of digits (one from each string), we calculate their sum along with the carry, determine the resulting digit and the new carry, and append the resulting digit to a StringBuilder. After processing all digits and any remaining carry, we reverse the StringBuilder and convert it to a string to get the final result.
//technique: Two Pointers
class AddBinary{
    public String addBinary(String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = charArrA.length - 1, j = charArrB.length - 1;
        int carry = 0;
        // Iterate through the input strings from the end to the beginning, calculating the sum of corresponding digits along with any carry, and appending the resulting digit to the StringBuilder. After processing all digits and any remaining carry, reverse the StringBuilder and convert it to a string to get the final result.    
        while (i >= 0 || j >= 0 || carry > 0) {
            int aNum = i >= 0 ? charArrA[i] - '0' : 0;
            int bNum = j >= 0 ? charArrB[j] - '0' : 0;

            int sum = aNum + bNum + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;

            sb.append((char)(digit + '0'));
        }

        return sb.reverse().toString();
    }
}