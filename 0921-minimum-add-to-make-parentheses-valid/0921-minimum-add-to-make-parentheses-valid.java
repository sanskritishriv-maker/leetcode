class Solution {
    public int minAddToMakeValid(String s) {
        int opening =0;
        int closing=0;
        int total=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opening++;
            }
            else{
                if(opening==0){
                    closing++;
                }
                else{
                    opening--;
                }
            }
            total=opening+closing;
        }

       return total; 
    }
}