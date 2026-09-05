class Solution {
    public int characterReplacement(String s, int k) {
    int l=0;
    int r=0;
    int maxfreq=0;
    int ans=0;
    int [] freq= new int[26];
    while(r<s.length()){
        freq[s.charAt(r)-'A']++;
        maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
        while((r-l+1)-maxfreq>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        ans=Math.max(ans,r-l+1);
        r++;
    }
    return ans;
    }
}