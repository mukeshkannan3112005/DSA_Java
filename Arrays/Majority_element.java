//https://leetcode.com/problems/majority-element/description/
//time complexity: O(n) where n is the length of the array
//space complexity: O(1) we are not using any extra space we are just using two variables to keep track of the count and the candidate
//Boyer–Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
