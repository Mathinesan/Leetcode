class Solution {
    public int findDuplicate(int[] nums) {
        int res = 0;
        outerloop:
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                    res = nums[i];
                    break outerloop;
                }
            }
        }
        return res;
    }
}
