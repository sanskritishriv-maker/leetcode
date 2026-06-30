class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int i=0;
        int j=cardPoints.length-1;
        while(i<k){
            leftsum+=cardPoints[i];
            i++;
        }
           int maxsum=leftsum + rightsum;
           i=k-1;

        while(i>=0){
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[j];
            maxsum=Math.max(maxsum,leftsum+rightsum);
            i--;
            j--;
            }
        return maxsum;
    }
}