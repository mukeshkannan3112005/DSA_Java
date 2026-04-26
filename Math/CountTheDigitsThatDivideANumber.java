package Math;
//https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
// time complexity: O(log n) because we are iterating through the digits of n, which takes O(log n) time.
// space complexity: O(1) because we are using constant space to store the count of digits that divide n.
// approach: we can convert the number n to a string to iterate through its digits. For each digit, we can check if it is not zero and if it divides n evenly. If both conditions are satisfied, we can increment the count of digits that divide n. Finally, we can return the count.
// technique used: math, string manipulation
class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int n=num;
        int result=0;
        while(n>0)
        {
            result+=num%(n%10)==0?1:0;
            n/=10;
        }
        return result;
    }
}