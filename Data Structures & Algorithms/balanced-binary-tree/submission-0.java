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
class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsTree(root) != -1;        
    }
    int dfsTree(TreeNode root){
        if(root == null) return 0;

        int leftHeight = dfsTree(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = dfsTree(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight) > 1) return -1;
        return (Math.max(leftHeight, rightHeight)+1);
    }
}