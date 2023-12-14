class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int Onerow[]= new int [grid.length];
        int Onecol[]= new int [grid[0].length];
        int Zerorow[]= new int [grid.length];
        int Zerocol[]= new int [grid[0].length];
        for(int i=0;i<grid.length;i++){
            int one=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    one++;
                }
            }
            Onerow[i]=one;
            Zerorow[i]=grid[i].length-one;
        } 
        for(int i=0;i<grid[0].length;i++){
            int one=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    one++;
                }
            }
            Onecol[i]=one;
            Zerocol[i]=grid.length-one;
        }
        int ans[][]= new int [grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
           
           for(int j=0;j<grid[0].length;j++){
               ans[i][j]=Onerow[i]+Onecol[j]-(Zerorow[i]+Zerocol[j]);
           }
        }
        
        
        return ans;

    }
}