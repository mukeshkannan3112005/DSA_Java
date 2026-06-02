//https://leetcode.com/problems/same-tree/
// time complexity: O(n) because we are visiting each node of the tree once to compare the two trees
// space complexity: O(log n) because the height of the tree is log n in the best case (balanced tree) and we are using recursion which takes O(log n) space in the call stack. 
// approach: we can use a recursive approach to compare the two trees. We will compare the values of the nodes and then recursively compare the left and right subtrees. If any of the comparisons fail, we will return false. If all comparisons pass, we will return true.    
// We will also check for the base cases where both nodes are null (return true) and where one node is null and the other is not (return false).    
// techinique used: recursion, depth first search (DFS)
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null)
            return true;

        // One node is null and the other is not
        if (p == null || q == null)
            return false;

        // Values are different
        if (p.val != q.val)
            return false;

        // Compare left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}