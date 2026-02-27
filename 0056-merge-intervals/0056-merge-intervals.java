class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        if(intervals.length==1)
        return intervals;
        List<int []> list=new ArrayList<>();
        for(int[] interval:intervals){
            int size=list.size();
            if(size==0 || list.get(size-1)[1]<interval[0]){
                list.add(interval);
            } else{
                list.get(size-1)[1]=Math.max(interval[1],list.get(size-1)[1]);
            }
        }
        int[][] ans=new int[list.size()][];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}