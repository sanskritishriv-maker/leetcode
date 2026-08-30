class Solution { 
    int i;
    int j;
    public boolean isRecursive(int i,int j,String s){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        
             }
        return isRecursive(i+1,j-1,s);


    }
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       s=s.replaceAll("[^a-zA-Z0-9]", "");

         i=0;
         j=s.length()-1;
       return isRecursive(i,j,s);
       
    }
}