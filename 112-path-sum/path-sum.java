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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        ans=false;

         check(root,targetSum);
         return ans;
        
    }
    public TreeNode check(TreeNode root, int targetSum){
        

        if(root==null) return null;

       TreeNode left= check(root.left,targetSum-root.val);
       TreeNode right=check(root.right,targetSum-root.val);

        if(left==null&&right==null && targetSum-root.val==0) ans=true;

        return root;
    }
}