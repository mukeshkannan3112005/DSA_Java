//https://leetcode.com/problems/count-complete-tree-nodes/description/
// time complexity: O(log(n)^2) because we are calculating the left and right height of the tree for each node and in the worst case, we may have to calculate the left and right height of the tree for all the nodes of the tree.     
// space complexity: O(1) because we are not using any extra space to store the nodes of the tree and we are only using a few variables to store the left and right height of the tree. 
// approach: we can calculate the left and right height of the tree and if they are equal, then we can return the number of nodes in the tree using the formula 2^h-1 where h is the height of the tree. If they are not equal, then we can recursively call the function for the left and right subtree and return the sum of the number of nodes in the left and right subtree plus one for the current node. 
// technique used: depth first search (DFS), binary tree, complete binary tree
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
class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
       if(root==null) return 0;
       int left=leftLength(root);
       int right=rightLength(root);
       if(left==right) //perfect tree
       {
            return (1<<right)-1; //pow(2,h)-1
       }
       return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int leftLength(TreeNode root)
    {
        int count=0;
        while(root!=null)
        {
            count++;
            root=root.left;
        }
        return count;
    }
    public int rightLength(TreeNode root)
    {
        int count=0;
        while(root!=null)
        {
            count++;
            root=root.right;
        }
        return count;
    }
}