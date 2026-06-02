class Solution {
    public void rotate(int[] nums, int k) {
         
        int n=nums.length;
        k=k%n;
        
        int s=n-k;
        if(k==0) return;
        rev(nums,0,s-1);
        rev(nums,s,n-1);
        rev(nums,0,n-1);
        }
        void rev(int nums[],int f,int e){
            while(f<=e){
                int temp=nums[f];
                nums[f]=nums[e];
                nums[e]=temp;
                f++;
                e--;

            }
        }
}