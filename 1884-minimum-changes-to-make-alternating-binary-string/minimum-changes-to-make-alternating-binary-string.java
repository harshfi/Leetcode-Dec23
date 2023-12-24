class Solution {
    public int minOperations(String s) {
    
     int i=0;
    char startWithOne='1';
    char startWithZero='0';
    int one=0;
    int zero=0;


     while(i<s.length()){

       if(s.charAt(i)==startWithOne){
           one++;
       }

       if(s.charAt(i)==startWithZero) zero++;

       startWithZero=startWithZero=='1'?'0':'1';
       startWithOne=startWithOne=='1'?'0':'1';
       i++;

     }
     
     return Math.min(one,zero);
     
    }
}