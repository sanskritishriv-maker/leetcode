class Solution {
    public List<List<Integer>>answer(List<List<Integer>>ans,List<Integer>cur,int i, boolean[] isVis,int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return ans  ;
        }
        for(int j=0;j<nums.length;j++){
            if(!isVis[j]){
                cur.add(nums[j]);
                isVis[j]=true;
                answer(ans,cur,i+1,isVis,nums);
                cur.remove(cur.size()-1);
                isVis[j]=false;
            }
        
        }
        return ans;
    }
    public List<List<Integer>> permute(int[] nums) { 
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        int i=0;
        boolean[] isVis=new boolean[nums.length];
        answer(ans,cur,i,isVis,nums);
        return ans;
        
    }
}