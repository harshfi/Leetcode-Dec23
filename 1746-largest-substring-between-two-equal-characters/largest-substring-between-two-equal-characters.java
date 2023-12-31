class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
       for(int i=0;i<s.length()-1;i++){

           int count=-1;
           

           for(int j=s.length()-1;j>i;j--){
               
                   if(count==-1 && s.charAt(i)==s.charAt(j)) count=0;
                   
                   else if (count>=0) count++;
               
              

           }
            max=Math.max(max,count);
       } 
       return max==-1?-1:max;
    }
}