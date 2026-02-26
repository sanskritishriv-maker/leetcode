class Solution {
    public void sortColors(int[] nums) {
        int s=0,m=0;
        int e=nums.length-1;
        while(e>=m){
            if(nums[m]==0){
                swap(nums,s++,m++);
            }
            else if(nums[m]==2){
                swap(nums,e--,m);
            }
            else{
                m++;
            }
        }
         
        
    }
    public void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
}