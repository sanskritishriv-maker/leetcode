class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int p=0;
        for(int i=0;i<nums.length-1;){
            if(nums[i]==nums[i+1]){
                p++;
                i=i+2;
            }
            else
            i++;
        }
        return p==n/2;
    }

        }