package Math;
//https://leetcode.com/problems/sum-of-multiples/description/
// time complexity: O(1) because we are using a constant number of operations to calculate the sum of multiples of 3, 5, and 7 up to n.
// space complexity: O(1) because we are using constant space to store the intermediate results of the calculations.
// approach: we can use the formula for the sum of the first m natural numbers to calculate the sum of multiples of k up to n. The formula is m * (m + 1) / 2, where m is the number of multiples of k up to n. We can then use the principle of inclusion-exclusion to calculate the sum of multiples of 3, 5, and 7 up to n by adding the sums of multiples of each individual number and subtracting the sums of multiples of their pairwise products, and finally adding back the sum of multiples of their triple product to avoid double subtraction.     
// technique used: math, inclusion-exclusion principle
class SumMultiples {

    // Function to calculate sum of multiples of k up to n
    private int cal(int n, int k) {
        int m = n / k;  // number of multiples of k
        return k * (m * (m + 1) / 2);
    }

    public int sumOfMultiples(int n) {
        return cal(n, 3) 
             + cal(n, 5) 
             + cal(n, 7)
             - cal(n, 3 * 5)
             - cal(n, 5 * 7)
             - cal(n, 3 * 7)
             + cal(n, 3 * 5 * 7);
    }
}