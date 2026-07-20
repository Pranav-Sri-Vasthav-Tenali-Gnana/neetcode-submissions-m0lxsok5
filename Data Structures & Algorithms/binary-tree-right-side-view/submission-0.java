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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> wrapList = new LinkedList<Integer>();
        if(root == null) return wrapList;
        q.offer(root);
        while(!q.isEmpty()){
            int levelnum = q.size();
            for(int i=0; i<levelnum; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                if(i == levelnum - 1){
                    wrapList.add(node.val);
                }
            }
        }
        return wrapList;
    }
}