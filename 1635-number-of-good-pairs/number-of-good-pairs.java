class Solution {
    public int numIdenticalPairs(int[] nums)
    { int count=0;
    Arrays.sort(nums);
  int same=1;
    for(int i=1;i<nums.length;i++)
    {
       if(nums[i-1]==nums[i]) same++;
        else{
             
              if (same>=2)
                {
                  count=count+(same*(same-1))/2;
                 }
             same=1;
        }

    } 
    
              
              if (same>=2)
              {
                 
                  count=count+(same*(same-1))/2;
                  same=1;
            }
    return count;
        
    }
  
}