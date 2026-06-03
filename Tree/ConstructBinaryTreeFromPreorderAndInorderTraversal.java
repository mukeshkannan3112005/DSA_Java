//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// time complexity: O(n) because we are visiting each node of the tree once to construct the binary tree
// space complexity: O(n) because we are using a hashmap to store the index of each value in the inorder array and we are also using recursion which takes O(n) space in the call stack in the worst case (skewed tree).
// approach: we can use a recursive approach to construct the binary tree. We will use a hashmap to store the index of each value in the inorder array for quick access. We will start with the first element of the preorder array as the root of the tree and then find the index of that element in the inorder array to determine the left and right subtrees. We will then recursively call the function to construct the left and right subtrees. Finally, we will return the root of the constructed binary tree.
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
import java.util.Map;
class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private int preorderIndex;
    private Map<Integer, Integer> mapping;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        mapping = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mapping.put(inorder[i], i);
        }

        preorderIndex = 0;
        return build(preorder, 0, inorder.length - 1);        
    }

    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = mapping.get(rootVal);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}