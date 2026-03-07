class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int pair=0;
        int leftover=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                 pair++; 
                 size=size-2;
                 i++;
            }
                
                  
                     
        }
                    
    
        int[] arr=new int[2];
        arr[0]=pair;
        arr[1]=size;
        return arr;




        
        
    }
}