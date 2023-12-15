class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set <String> set =new HashSet<>();

         for(List<String> p: paths){
            set.add(p.get(0));
        }

        for(List<String> p: paths){
            if(!set.contains(p.get(1))) return p.get(1);
        }
        return "";
    }
}