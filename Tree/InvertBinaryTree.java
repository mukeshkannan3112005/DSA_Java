//https://leetcode.com/problems/invert-binary-tree/
// time complexity: O(n) because we are visiting each node of the tree once to invert the binary tree
// space complexity: O(log n) because the height of the tree is log n in the best case (balanced tree) and we are using recursion which takes O(log n) space in the call stack.
// approach: we can use a recursive approach to invert the binary tree. We will swap the left and right child of each node and then recursively call the function on the left and right child. Finally, we will return the root of the inverted binary tree.    
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
class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // We will swap the left and right child of each node and then recursively call the function on the left and right child. Finally, we will return the root of the inverted binary tree. 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;        
    }
}