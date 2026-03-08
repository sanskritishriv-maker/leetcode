class Solution {
    public int smallestEqual(int[] nums) {
        int a=-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]) {
                a=i; 
                break; 
                }

        
        }
        
   return a;  }
}