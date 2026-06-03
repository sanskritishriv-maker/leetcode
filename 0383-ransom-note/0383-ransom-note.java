class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] freq=new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-97]++;
        }
         for(char ch:ransomNote.toCharArray()){
            freq[ch-97]--;
            if(freq[ch-97]<0){
                return false;
            }

         }
         return true;

    }
}