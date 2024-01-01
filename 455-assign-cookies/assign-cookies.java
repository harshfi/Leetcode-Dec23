class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        boolean check[]= new boolean [s.length];
        int count=0;


        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(check[j]==false && s[j]>=g[i]) {
                    check[j]=true;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}