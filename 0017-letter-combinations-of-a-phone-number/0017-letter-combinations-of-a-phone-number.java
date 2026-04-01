class Solution {
    public void solve(List<String>ans,String cur,int i,Map<Character,String>maps,String digits){
        if(i==digits.length()){
            ans.add(cur);
            return;
        }
        String temp=maps.get(digits.charAt(i));
        for(int j=0;j<temp.length();j++){
            solve(ans,cur+temp.charAt(j),i+1,maps,digits);
        }
    }
    public List<String> letterCombinations(String digits) {

     List<String>ans=new ArrayList<>();
     String cur="";
     Map<Character,String>maps=new HashMap<>();
     maps.put('2',"abc");
     maps.put('3',"def");
     maps.put('4',"ghi");
     maps.put('5',"jkl");
     maps.put('6',"mno");
     maps.put('7',"pqrs");
     maps.put('8',"tuv");
     maps.put('9',"wxyz");
     solve(ans,cur,0,maps,digits);
     return ans;
        
    }
}