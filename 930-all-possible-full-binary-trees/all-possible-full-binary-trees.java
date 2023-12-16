class Solution {
  

    public List<TreeNode> allPossibleFBT(int n) {
       

        

        return permuationTree(n);
    }

    public List<TreeNode> permuationTree(int n) {
       if(n==1){
         List<TreeNode> base= new ArrayList<>();
         TreeNode root=new TreeNode(0);
         base.add(root);
         return base;
       }
        List<TreeNode> ans= new ArrayList<>();
        for(int i=1;i<n;i+=2){
        List<TreeNode> left = permuationTree(i);
        List<TreeNode> right = permuationTree(n-1-i);

        for(TreeNode l : left){
            for(TreeNode r : right){
                TreeNode root=new TreeNode(0);
                root.left=l;
                root.right=r;
                ans.add(root);
            }
        }
        }
        return ans;
    }
}
