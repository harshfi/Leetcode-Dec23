class Solution {

    public int numSpecial(int[][] mat) {

        int count=0;
        System.out.println(mat[0].length);

        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[0].length;j++){

                if(mat[i][j]==1){

                    if(check(mat,i,j)){
                        count++;
                    }

                }

            }
        }
        return count;
    }
    public static boolean check(int [][]mat,int row,int col){
     
     for(int i=0;i<mat[0].length;i++){
         
         if(mat[row][i]!=0 && i!=col ) return false;
     }
     
      for(int i=0;i<mat.length;i++){
         if(mat[i][col]!=0 && i!=row) return false;
     }
     return true;


    }
}