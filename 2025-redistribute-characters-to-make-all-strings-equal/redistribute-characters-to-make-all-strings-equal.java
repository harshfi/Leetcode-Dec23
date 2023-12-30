class Solution {
    public boolean makeEqual(String[] words) {
    HashMap <Character,Integer> map= new HashMap<>();
    for(int i=0;i<words.length;i++){
        for( int j=0;j<words[i].length();j++){
            char a= words[i].charAt(j);
             if(map.containsKey(a)){
                 map.put(a,map.get(a)+1);
             }
             else{
                 map.put(a,1);
             }
        }

    }
    for (char c : map.keySet()) { 
           if(map.get(c)%words.length!=0) return false;

}
return true;

    }
}