//https://leetcode.com/problems/number-of-1-bits/description/
// timecomplexity: O(1) since we are iterating through a fixed number of bits (32 bits for an integer).
//spacecomplexity: O(1) since we are using a constant amount of space to store the result and the loop variable.
//Approach: We can use bit manipulation to count the number of 1 bits in the    binary representation of the given integer. We can iterate through each bit position from 0 to 31, right shift the integer by the current bit position, and check if the least significant bit is 1. If it is, we increment our result counter. Finally, we return the total count of 1 bits.               
//technique: Bit Manipulation
public class NumberOfOneBit {
    public int hammingWeight(int n) {
        int res = 0;
        // Iterate through each bit position from 0 to 31, right shift the integer by the current bit position, and check if the least significant bit is 1. If it is, increment the result counter. Finally, return the total count of 1 bits. 
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                res += 1;
            }
        }
        return res;        
    }
}