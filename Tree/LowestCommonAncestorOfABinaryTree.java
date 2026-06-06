//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
// time complexity: O(n) because we are visiting each node of the tree once and we are doing a constant amount of work for each node.   
// space complexity: O(h) where h is the height of the tree because we are using a recursive stack to store the nodes of the tree and in the worst case, we may have to store all the nodes of the tree in the recursive stack.
// approach: we can use a recursive approach to find the lowest common ancestor of the two nodes    
// technique used: depth first search (DFS), binary tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //if both nodes are at same subtree return the node at the lowest level.
 //if one node in the left subtree and another in the right subtree return the root node because it is the lowest common ancestor.
class LowestCommonAncestorOfABinaryTree{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)
        {
            return root;
        }
        return left!=null?left:right;
    }
}
