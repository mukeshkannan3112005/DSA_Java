//https://leetcode.com/problems/maximum-depth-of-binary-tree/
// time complexity: O(n) because we are visiting each node of the tree once to find the maximum depth
// space complexity: O(log n) because the height of the tree is log n in the best case (balanced tree) and we are using recursion which takes O(log n) space in the call stack.
// approach: we can use a recursive approach to find the maximum depth of the binary tree.  
class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));        
    }
}