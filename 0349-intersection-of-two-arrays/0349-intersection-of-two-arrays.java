class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer>set1=new HashSet<>();
    Set<Integer>set2=new HashSet<>();
    for(int j:nums1) set1.add(j);
    for(int k:nums2) set2.add(k);
    set1.retainAll(set2);
    int n=set1.size();
    int[] arr=new int[n];
    int i=0;
    for(int x:set1){
        arr[i++]=x;
    
    }  
    return arr;
    }
}