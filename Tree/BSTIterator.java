//https://leetcode.com/problems/binary-search-tree-iterator/description/
// time complexity: O(1) for next() and hasNext() because we are using a stack to store the nodes of the binary search tree and we are only visiting each node once.
// space complexity: O(h) where h is the height of the tree because we are using a stack to store the nodes of the binary search tree and in the worst case, we may have to store all the nodes of the tree in the stack.
// approach: we can use a stack to store the nodes of the binary search tree and we can use a helper function to find the leftmost node of the binary search tree and we can push all the nodes of the leftmost path of the binary search tree into the stack.
// technique used: stack, depth first search (DFS)
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
import java.util.Stack;
class BSTIterator {
    private Stack <TreeNode> stack=new Stack<>();
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        TreeNode next=stack.pop();
        if(next.right!=null)
        {
            inorder(next.right);
        }
        return next.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public void inorder(TreeNode root)
    {
        while(root!=null){
           stack.push(root);
           root=root.left; 
        }     
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
