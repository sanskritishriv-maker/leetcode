class Solution {
    public char findTheDifference(String s, String t) {
        int[] frq=new int[26];
        for(char ch:t.toCharArray()){
            frq[ch-97]++;
        }
        for(char ch:s.toCharArray()){
            frq[ch-97]--;
        }
       for(int i=0;i<26;i++){
        if(frq[i]>0){
            return(char)(i+'a');
        }
       }
       return ' ';
    }
}