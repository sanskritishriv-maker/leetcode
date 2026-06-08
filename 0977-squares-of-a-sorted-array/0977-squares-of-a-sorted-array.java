class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        int left=0;
        int right=n-1;
        int ind=n-1;
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                ans[ind]=leftsq;
                left++;
            }
            else if(rightsq>=leftsq){
                ans[ind]=rightsq;
                right--;
            }
            ind--;
        }
        
return ans;
        
    }
}