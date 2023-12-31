class Solution {
    public List<Integer> partitionLabels(String s) {
        int last []= new int [26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        int j=0;
        int start=0;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            j=Math.max(j, last[s.charAt(i)-'a']);
            if(j==i){
             ans.add(i-start+1);
             start=i+1;
            }
        }
        return ans;

    }
}