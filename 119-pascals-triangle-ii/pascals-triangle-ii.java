class Solution {
    public List<Integer> getRow(int row) {
     List<Integer> list= new ArrayList<>();
     list.add(1);
     for(int i=1;i<=row;i++){

         int d=(int) (((long)((long)list.get(i-1)*(long)(row-i+1)))/i);
         list.add(d);
     }
     return list;

    }
}