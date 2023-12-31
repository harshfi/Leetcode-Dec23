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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null ) return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){

            List<Integer> list= new ArrayList<>();
            List<TreeNode> nodeList= new ArrayList<>();

            while(!q.isEmpty()){

                TreeNode r=q.remove();
                if(r!=null)
                list.add(r.val);

                if(r!=null&&r.left!=null) nodeList.add(r.left);

                if(r!=null&&r.right!=null) nodeList.add(r.right);

            }

            ans.add(new ArrayList(list));
            
            for(TreeNode r : nodeList){
                q.add(r);
            }
            
        }
        Collections.reverse(ans);
        return ans;
    }
}