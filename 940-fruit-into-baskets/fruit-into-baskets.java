class Solution {
    public int totalFruit(int[] f) {
        if(f.length==1)return 1;
        int n= f.length;
        int max=0;
        int ai=0,bi=0;
        int a[]=new int[2];
        int b[]=new int[2];
        a[1]=1;
        a[0]=f[0];
         b[0]=-1;
        for(int i=1;i<n;i++){
         
         if(b[0]==-1 && f[i]!=a[0]){
             b[0]=f[i];
             b[1]=1;
         }
         else if(b[0]!=f[i] && a[0]!=f[i] ){
             for(int j=bi;j<i;j++){
                 if(f[j]==a[0]) a[1]--;
                 else b[1]--;
                
                 if(a[1]==0 || b[1]==0){
                     bi=j+1;
                     break;
                 }
                 
             }

             if(a[1]==0){
                 a[0]=f[i];
                 a[1]=1;
             }
             else{
                 b[0]=f[i];
                 b[1]=1;
             }
         }

         else if( a[0]==f[i] ) a[1]++;
         else if(b[0]==f[i])b[1]++;

         
            max=Math.max(max,a[1]+b[1]);

        }
        return max;
    }
}