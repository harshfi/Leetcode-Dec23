class Solution {
    int mod= (int)(1e9+7);
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]= new int [n+1][target+1];
        for(int d[] : dp){
            Arrays.fill(d,-1);
        }
       return countTheWays(dp,k,target, n);
        
    }
    public int countTheWays(int [][]dp,int k,int target,int n){
        if(n==0 && target==0) return 1;
        if(n<=0|| target<=0) return 0;
        
        if(dp[n][target]!=-1) return dp[n][target]% mod;

        int ways=0;
        for(int i=1;i<=k;i++){
          ways=(ways+ countTheWays(dp,k,target-i, n-1))%mod;
        }
        dp[n][target]=(ways%mod);
        return dp[n][target];
    }
}