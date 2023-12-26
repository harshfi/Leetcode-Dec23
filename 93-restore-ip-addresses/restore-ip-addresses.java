class Solution {
    List<String> list;
    public List<String> restoreIpAddresses(String s) {
        list= new ArrayList<>();
        if(s.length()>12) return list;
        form(s,"",0,0);
        return list;
        
    }
    public void form(String s, String str, int i,int dot){

        if(i==s.length()&& str.length()-4==s.length()&& dot==4) {
            
            list.add(str.substring(0,str.length()-1));
            return;
        }
        if(i>=s.length() || str.length()-4>=s.length()|| dot>=4) {
           
            return;
        }
       
       
       if(s.charAt(i)=='0'){
         form(s,str+s.charAt(i)+".",i+1,dot+1);
       }
       else{

           form(s,str+s.charAt(i)+".",i+1,dot+1);

          if(i+1<s.length()){
           form(s,str+s.substring(i,i+2)+".",i+2,dot+1);
          }

          if(i+2<s.length()){
              int num =(int)((s.charAt(i)-'0')*100 +(s.charAt(i+1)-'0' )*10 +( s.charAt(i+2)-'0'));
              if(num<=255){
                  form(s,str+num+".",i+3,dot+1);
              }
          }
       }
    }
}