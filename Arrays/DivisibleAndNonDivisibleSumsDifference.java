//https://leetcode.com/problems/difference-between-sum-of-non-divisible-and-divisible-by-m/description/ 
//time complexity: O(1)
//space complexity: O(1)
//approach: we can calculate the sum of first n natural numbers using the formula n*(n+1)/2. Then we can calculate the sum of numbers divisible by m using the formula m*(k*(k+1)/2) where k is the number of multiples of m less than or equal to n. Finally, we can return the difference between the total sum and twice the sum of divisible numbers to get the desired result. 
//technique used: math
class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        //sum of first n natural numbers
        int total = n * (n + 1) / 2;
        //number of multiples of m less than or equal to n
        int k = n / m;
        //sum of numbers divisible by m
        int sumDiv = m * (k * (k + 1) / 2);

        return total - 2 * sumDiv;
    }
}