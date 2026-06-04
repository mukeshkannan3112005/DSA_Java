//https://leetcode.com/problems/path-sum/
// time complexity: O(n) because we are visiting each node of the tree once to find the path sum
// space complexity: O(log n) because the height of the tree is log n in the best case (balanced tree) and we are using recursion which takes O(log n) space in the call stack.
// approach: we can use a recursive approach to find the path sum of the binary tree.
// technique used: recursion, depth first search (DFS)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;  
        if(root.left==null && root.right==null)
        {
            return targetSum-root.val==0;
        }
        targetSum-=root.val;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);

    }
}