class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp,-1);
         return decode(s,0,dp);
         
    }

    public int decode(String s,int i,int[]dp){
    if(i==s.length())
    {
        return 1;
    }
    if(i>s.length())
    return 0;

    if(dp[i]!=-1)
    return dp[i];
    int ans1=0;
    if(s.charAt(i)!='0')
    ans1=decode(s,i+1,dp);
    int ans2=0;
    if(s.length()>i+1)
    {
        int a=Integer.parseInt(s.substring(i,i+2));
        if(s.charAt(i)!='0' && a<=26)
        {
           ans2= decode(s,i+2,dp);
        }
    }
    return dp[i]=ans1+ans2;}
}