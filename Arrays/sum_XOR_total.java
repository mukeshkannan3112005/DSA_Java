class Solution {

    // This method returns the sum of XOR values of all subsets
    public int subsetXORSum(int[] nums) {

        // 'total' will store the bitwise OR of all numbers
        // It helps us know which bits can contribute to the XOR
        int total = 0;

        // Loop through each number in the array
        for (int num : nums) {

            // Bitwise OR operation
            // If a bit is set (1) in any number,
            // it will be set in 'total'
            total |= num;
        }

        // nums.length gives number of elements (n)
        // (1 << (n - 1)) means 2^(n - 1)
        // Each bit contributes in exactly half of all subsets
        // So we multiply the OR value with 2^(n - 1)
        return total * (1 << (nums.length - 1));
    }
}
