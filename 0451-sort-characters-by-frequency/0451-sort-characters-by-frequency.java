class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        List<Character>[]arr=new ArrayList[s.length()+1];
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(ch);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                for(char ch:arr[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
      return sb.toString();
        
    }
}