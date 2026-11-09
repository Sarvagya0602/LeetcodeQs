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
    static int depth(TreeNode root,int d){
        if(root.left==null && root.right==null) return d;
        int l=Integer.MAX_VALUE,r=Integer.MAX_VALUE;
        if(root.left!=null) l=depth(root.left,d+1);
        if(root.right!=null) r=depth(root.right,d+1);
        return Math.min(l,r);
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return depth(root,1);
    }
}