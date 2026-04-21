package Math;
//https://leetcode.com/problems/smallest-even-multiple/description/
// time complexity: O(1)
// space complexity: O(1)
// approach: if n is even then the smallest even multiple of n is n itself. If n is odd then the smallest even multiple of n is 2*n because 2*n will be the first even number that is a multiple of n.  
// technique used: math
class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
            return n;
        }
        return n*2;
    }
}