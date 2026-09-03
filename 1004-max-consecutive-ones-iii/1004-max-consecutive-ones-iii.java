class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxlength=0;
        int zero=0;
        int length=0;
        while(j<nums.length){
         if(nums[j]==0){
            zero++;
         }
         if(zero>k){
            if(nums[i]==0){
                zero--;
            }
            i++;
         }
         if(zero<=k){
            length=j-i+1;
            maxlength=Math.max(length,maxlength);
         }
         j++;
        }
       return maxlength; 
    }
}