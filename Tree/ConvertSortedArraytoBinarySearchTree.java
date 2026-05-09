
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// time complexity: O(n) because we are visiting each node of the tree once to construct
//  space complexity: O(log n) because the height of the tree is log n in the best case (balanced tree) and we are using recursion which takes O(log n) space in the call stack.
// approach: we can use a recursive approach to construct the binary search tree. We can find the middle element of the array and make it the root of the tree. Then we can recursively construct the left subtree using the left half of the array and the right subtree using the right half of the array.
// technique used: recursion, divide and conquer
class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);        
    }
    // helper function to construct the binary search tree
    private TreeNode convert(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // find the middle element of the array
        int mid = left + (right - left) / 2;
        // create a new node with the middle element as the value
        TreeNode node = new TreeNode(nums[mid]);
        // recursively construct the left subtree and right subtree
        node.left = convert(nums, left, mid - 1);
        node.right = convert(nums, mid + 1, right);
        
        return node;
    }    
}