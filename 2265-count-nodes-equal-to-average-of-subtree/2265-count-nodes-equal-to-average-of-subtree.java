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
    static int result,Nodesum,count;

    static int[] isaverage(TreeNode root){
        if(root==null) return new int[]{0,0};
        int[] left=isaverage(root.left),right=isaverage(root.right);
        Nodesum=left[0]+right[0]+root.val;
        count=left[1]+right[1]+1;
        if(Math.round(Nodesum/count)==root.val) result++;
        return new int[]{Nodesum,count};
    }
    public int averageOfSubtree(TreeNode root) {
        result=0;
        isaverage(root);
        return result;
    }
}