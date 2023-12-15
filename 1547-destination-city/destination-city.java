class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap <String,Boolean> map= new HashMap<>();
        Set <String> set =new HashSet<>();

        for(List<String> p: paths){
            map.put(p.get(0),true);
            set.add(p.get(0));
            set.add(p.get(1));
        }
        for( String i : set){
            if(!map.containsKey(i)) return i;
        }
        return "no";
    }
}