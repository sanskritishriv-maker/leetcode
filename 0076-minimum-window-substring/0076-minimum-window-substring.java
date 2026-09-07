class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int  [] freq=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int right=0;
        int start=0;
        int req=t.length();
        int minlen=Integer.MAX_VALUE;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                req--;
            }
            freq[ch]--;
            right++;
            while(req==0){
                if((right-left)<minlen){
                    minlen=right-left;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    req++;
                }
                left++;
            }
        }
return  minlen == Integer.MAX_VALUE ? "": s.substring(start, start + minlen);
        
    }
}