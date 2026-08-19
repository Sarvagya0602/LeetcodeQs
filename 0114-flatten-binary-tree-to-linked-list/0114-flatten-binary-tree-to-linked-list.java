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

    static TreeNode dfs(TreeNode root){
        if(root==null) return null;
    
        root.left=dfs(root.left);
        root.right=dfs(root.right);

        TreeNode l=root.left,r=root.right;

        if (l != null) {
            while (l.right != null)
                l = l.right;
            
            l.right = r;

            root.right = root.left;
            root.left = null;
        }

        return root;
    }

    public void flatten(TreeNode root) {
        root=dfs(root);
    }
}