class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       int max=0;
       boolean back[][]=new boolean [grid.length][grid[0].length]; 
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                 int area=  maxArea(i,j,grid,back);
                 max=Math.max(area, max);
               }
           }
       } 
       return max;
    }
    
    public int maxArea(int i ,int j, int [][] grid, boolean [][]back){
        if(i<0 || j<0 ||i>= grid.length || j>=grid[0].length|| grid[i][j]==0|| back[i][j]==true) return 0;
      
      back[i][j]=true;


      int bottom=  maxArea(i+1,j,grid,back);
      int right=   maxArea(i,j+1,grid,back);
      int top =     maxArea(i-1,j,grid,back);
      int left =   maxArea(i,j-1,grid,back);

      
      

      return 1 + top + right + left + bottom;
    }
}
