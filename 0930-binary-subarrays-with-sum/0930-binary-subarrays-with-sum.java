class Solution { 
    public int most(int [] nums,int goal){
     int left=0;
     int right=0;
     int sum=0;
     int count=0;
     if(goal<0) return 0;
     while(right<nums.length){
     sum+=nums[right];
     while(sum>goal){
    sum=sum-nums[left];
      left=left+1;
       }
     count =count+(right-left+1);
     right++; 
         } 
    return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
     return most(nums,goal)-most(nums,goal-1);
    }
}
      