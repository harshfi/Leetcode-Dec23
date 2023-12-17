class Solution {
  

    public List<TreeNode> allPossibleFBT(int n) {
       
        HashMap<Integer,List<TreeNode>>dp =new HashMap<>();
        return permuationTree(n,dp);
    }

    public List<TreeNode> permuationTree(int n,HashMap<Integer,List<TreeNode>>dp) {
       if(n==1){
         List<TreeNode> base= new ArrayList<>();
         TreeNode root=new TreeNode(0);
         base.add(root);
         return base;
       }
       if(dp.containsKey(n)) return dp.get(n);
        List<TreeNode> ans= new ArrayList<>();
        for(int i=1;i<n;i+=2){
        List<TreeNode> left = permuationTree(i,dp);
        List<TreeNode> right = permuationTree(n-1-i,dp);

        for(TreeNode l : left){
            for(TreeNode r : right){
                TreeNode root=new TreeNode(0);
                root.left=l;
                root.right=r;
                ans.add(root);
            }
        }
        }
        dp.put(n,ans);
        return ans;
    }
}
