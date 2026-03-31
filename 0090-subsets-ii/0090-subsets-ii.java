class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        solve(ans,cur,nums,0,true);
        return ans;    
    }
    private void solve(List<List<Integer>>ans,List<Integer>cur,int[] nums,int i,boolean picked){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(i==0 || nums[i-1]!=nums[i] || picked){
            cur.add(nums[i]);
            solve(ans,cur,nums,i+1,true);
            cur.remove(cur.size()-1);
        }
        solve(ans,cur,nums,i+1,false);
    }
}