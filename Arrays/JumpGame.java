//https://leetcode.com/problems/jump-game/description/
// time complexity:O(n) because we are traversing the array once to find the minimum number of jumps to reach the end of the array
// space complexity:O(1) because we are not using any extra space to store the elements of the array and we are using only a variable to store the goal index which is the index of the last element of the array   
class JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        // we are traversing the array from the end and checking if the current index plus the value at that index is greater than or equal to the goal index then we are updating the goal index to the current index because we can jump from the current index to the goal index and we are doing this until we reach the beginning of the array and if the goal index is 0 then we can jump to the end of the array from the beginning of the array 
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;        
    }
}