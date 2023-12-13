class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     list = new ArrayList<>();
     List<Integer> l= new ArrayList<>();
     Arrays.sort(nums);
     list.add(new ArrayList<>(l) );
        subset(nums,list,l,0);
        return list;
    }
    public static void subset(int[] nums, List<List<Integer>> list, List<Integer> l, int i ){
        if(i==nums.length){
          if(! list.contains(l)){
        list.add(new ArrayList<>(l) ); 
          return; 
        }
        }
        if(! list.contains(l)){
        list.add(new ArrayList<>(l) ); 
}
        for(int j=i;j<nums.length;j++){

                l.add(nums[j]);

                subset(nums,list,l,j+1);

                l.remove(l.size()-1);

        }
    }
    }

