//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// time complexity: O(n) because we are visiting each node of the tree once to construct the binary tree
// space complexity: O(n) because we are using a hashmap to store the index of each value in the inorder array and we are also using recursion which takes O(n) space in the call stack in the worst case (skewed tree).
// approach: we can use a recursive approach to construct the binary tree. We will use a hashmap to store the index of each value in the inorder array for quick access. We will start with the last element of the postorder array as the root of the tree and then find the index of that element in the inorder array to determine the left and right subtrees. We will then recursively call the function to construct the left and right subtrees. Finally, we will return the root of the constructed binary tree.
// technique used: recursion, depth first search (DFS), hashmap
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
import java.util.HashMap;
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    private HashMap<Integer,Integer> map;
    private int postorderindex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        postorderindex=postorder.length-1;
        return build(postorder,0,inorder.length-1);
    }
    private TreeNode build(int[] postorder,int start,int end)
    {
        if(start>end) return null;

        int rootVal=postorder[postorderindex--];
        TreeNode root=new TreeNode(rootVal);
        int mid=map.get(rootVal);

        root.right=build(postorder,mid+1,end);
        root.left=build(postorder,start,mid-1);

        return root;
    }
}