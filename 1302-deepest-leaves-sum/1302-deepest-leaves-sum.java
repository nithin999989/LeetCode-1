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

    public int depth(TreeNode root,int depth){
        if(root == null) return depth;
        return Math.max(depth(root.left,depth),depth(root.right,depth)) + 1;
    }
    
    public int maxdepthSum(TreeNode root, int currDepth, int maxDepth){
        if(root == null) return 0;
        if(currDepth == maxDepth) return root.val;
        return maxdepthSum(root.left,currDepth+1,maxDepth) + maxdepthSum(root.right,currDepth+1,maxDepth);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        return maxdepthSum(root,1,depth(root,0));
    }
}