class Solution {
    public int countAtmost(int [] nums , int k){
        int left =0;
        int right=0;
        int res=0;
        while(right<nums.length){
            if(nums[right]%2!=0)
            k--; 
            while(k<0){
                if(nums[left]%2!=0) k++;
                left++;
            }
            res+=right-left+1;
            right++;
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtmost(nums,k)-countAtmost(nums,k-1);
        
    }
}