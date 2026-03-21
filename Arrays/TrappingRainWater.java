// https://leetcode.com/problems/trapping-rain-water/
// time complexity: O(n)
// space complexity: O(1)
class TrappingRainWater {
    public int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;
        //Use two pointers, one starting from the left and the other from the right, to traverse the height array. At each step, compare the maximum height on the left and right sides. If the left maximum is less than the right maximum, it means that the water trapped at the current left position is determined by the left maximum, so we calculate the trapped water and move the left pointer to the right. If the right maximum is less than or equal to the left maximum, it means that the water trapped at the current right position is determined by the right maximum, so we calculate the trapped water and move the right pointer to the left. We continue this process until the two pointers meet, at which point we will have calculated all the trapped water.  
        while (start < end) {

            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            if (leftMax < rightMax) {

                totalWater += leftMax - height[start];
                start++;

            } else {

                totalWater += rightMax - height[end];
                end--;
            }
        }

        return totalWater;
    }
}