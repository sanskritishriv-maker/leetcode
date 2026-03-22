class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>cur=new ArrayList<>();

        subset(nums,i,cur,ans);
        return ans;
    }
    public void subset(int [] nums, int i,  List<Integer>cur,  List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
             }
        cur.add(nums[i]);
        subset(nums,i+1,cur,ans);
        cur.remove(cur.size()-1);
        subset(nums,i+1,cur,ans);


      
    }
}