class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for (int i : nums) sum+=i;

        if(sum%k!=0) return false;
        if(nums.length<k) return false;
        boolean visited[] = new boolean [nums.length];
        int subsetSum=sum/k;
        return equalSum(nums, visited, 0, k, 0 , subsetSum ); 
    }
    private boolean equalSum(int []nums,boolean[] visited,int  start,int  k,int currSum ,int  subsetSum ){
        if(k==0) return true;
        if(currSum>subsetSum) return false;

        if(currSum==subsetSum){
            return equalSum(nums, visited, 0, k-1, 0 , subsetSum );
        }
        for(int i=start;i<nums.length;i++){
            if(visited[i]) continue;

            visited[i]=true;
            if(equalSum(nums, visited, i+1, k, currSum+nums[i] , subsetSum )) return true;
            visited[i]=false;
        }
        return false;
    }
}