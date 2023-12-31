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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeTree(nums,0,nums.length-1);
        
    }
    public TreeNode makeTree(int []nums,int start, int end){
        if(start<0|| end>=nums.length||start>=nums.length ||end<0||start>end) return null;

        TreeNode root= new TreeNode();
        int mid=(start+end)/2;
        root.val=nums[mid];
        
         TreeNode left= makeTree(nums,start,mid-1);
         TreeNode right= makeTree(nums,mid+1,end);
         root.left=left;
         root.right=right;
          return root;
    }
}