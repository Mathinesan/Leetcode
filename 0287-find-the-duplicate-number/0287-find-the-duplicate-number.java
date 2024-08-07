class Solution {
    public int findDuplicate(int[] nums) {
        int res = 0;
        HashSet<Integer> hash = new HashSet<>();
        loop:
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(hash.contains(nums[j])){
                    res = nums[j];
                    break loop;
                }
                else{
                    hash.add(nums[j]);
                }
            }
        }
        return res;
    }
}