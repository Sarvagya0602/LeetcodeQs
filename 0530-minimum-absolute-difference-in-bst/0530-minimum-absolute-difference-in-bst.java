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
    static void inorder(TreeNode root,List<Integer> srtval){
        if(root==null) return;

        inorder(root.left,srtval);
        srtval.add(root.val);
        inorder(root.right,srtval);
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> srtval=new ArrayList<>();
        inorder(root,srtval);
        int result=Integer.MAX_VALUE;
        for(int i=1;i<srtval.size();i++){
            result=Math.min(result,srtval.get(i)-srtval.get(i-1));
        }
        return result;
    }
}