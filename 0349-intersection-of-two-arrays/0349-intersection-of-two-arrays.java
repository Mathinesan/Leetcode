class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    h.add(nums1[i]);
                    break;
                }
            }
        }
        int z = 0;
        int[] arr = new int[h.size()];
        for(int k : h){
            arr[z]=k;
            z++;
        }
        return arr;
    }
}