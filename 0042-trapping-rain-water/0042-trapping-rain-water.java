class Solution {
    public int trap(int[] height) { 
        int maxLeft=height[0];
        int maxRight=height[height.length-1];
        int maxL[]=new int[height.length];
        int maxR[]=new int[height.length];
        maxL[0]=maxLeft;
        for(int i=1;i<maxL.length;i++){
            maxLeft=Math.max(maxLeft,height[i]);
            maxL[i]=maxLeft;
        }
        maxR[maxR.length-1]=maxRight;
        for(int i=maxR.length-2;i>=0;i--){
            maxRight=Math.max(maxRight,height[i]);
            maxR[i]=maxRight;
        }
        int ans=0;
        for(int i=0;i<height.length;i++){
            ans+=Math.min(maxL[i],maxR[i])-height[i];
        }
        return ans;
        
    }
}