package Math;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/    
// time complexity: O(log n) where n is the input number because we are iterating through the digits of the number.
// space complexity: O(1) because we are using constant space to store the product and  sum of the digits.
// approach: we can simply iterate through the digits of the number and calculate the product and sum of the digits. We can find the last digit of the number by taking the modulus of the number with 10 and we can remove the last digit of the number by dividing the number by 10. Finally, we will return the difference between the product and sum of the digits.
// technique used: math

class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n=n/10;
        }
        return product-sum;
    }
}