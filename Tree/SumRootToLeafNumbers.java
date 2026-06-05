//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
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
class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return digitsSum(root,0);
    }
    // we are using a helper function to find the path sum of the binary tree.
    public int digitsSum(TreeNode root,int currentVal)
    {
        if(root==null)
            return 0;

        currentVal=currentVal*10+root.val;

        if(root.left==null && root.right==null)
        {
            return currentVal;
        }

        return digitsSum(root.left,currentVal)
               +digitsSum(root.right,currentVal);
    }
}