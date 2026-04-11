//https://leetcode.com/problems/powx-n/description/
// timecomplexity: O(log n)
//spacecomplexity: O(log n) due to recursive stack space
//Approach: We can use the property of exponentiation to calculate the power efficiently. If n is even, we can calculate x^(n/2) and then square it. If n is odd, we can calculate x^((n-1)/2), square it, and then multiply by x. This approach reduces the number of multiplications needed, resulting in a logarithmic time complexity.  
//technique: Binary Exponentiation
class Pow {
    public double myPow(double x, int n) {
        return binaryExp(x, (long) n);
    }
    // Helper function for binary exponentiation
    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }
       // Handle negative exponent
        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }
       // If n is odd, multiply by x and reduce n by 1 to make it even
        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }
}