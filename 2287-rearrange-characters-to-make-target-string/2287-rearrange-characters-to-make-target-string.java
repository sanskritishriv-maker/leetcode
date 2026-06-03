class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sfreq=new int[26];
        int[] tfreq=new int[26];
        for(char ch:s.toCharArray()){
            sfreq[ch-97]++;
        }
        for(char ch:target.toCharArray()){
            tfreq[ch-97]++;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(tfreq[i]>0){
                ans=Math.min(ans,sfreq[i]/tfreq[i]);
            }
        }
     return ans;   
    }
}