//https://leetcode.com/problems/container-with-most-water/description/
//timecomplexity: O(n) as we are traversing the array once
//spacecomplexity: O(1) as we are using constant space for variables
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        // Use two pointers to find the maximum area of water that can be contained
        while (left < right) {
            // Calculate the area formed by the lines at the left and right pointers and update maxArea if it's larger  
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            // Move the pointer that has the smaller height, as this is the limiting factor for the area    
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;        
    }
}