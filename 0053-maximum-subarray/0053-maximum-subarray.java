class Solution {
    public int maxSubArray(int[] nums) {
        int maxSumm=nums[0];
        int cursum=0;
        for(int a:nums){
            cursum+=a;
            maxSumm=Math.max(maxSumm,cursum);
            if(cursum<0){
                cursum=0;
            }
        }
        return maxSumm;
        
    }
}