class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums2){
            if(map.getOrDefault(num,0)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int m=list.size();
        int[] finale = new int[m];
        int ind=0;
        for(int num:list){
            finale[ind]=num;
            ind++;
        }

        return finale;
    }
}