class Solution {
    public int jump(int[] nums) {
        int farther =0;
        int current =0;
        int jump=0;
        if(nums.length==0) return 0;

        for(int i=0;i<nums.length-1;i++){
            farther = Math.max(farther, i+nums[i]);

            if(i==current){
                jump++;
                current = farther;
            }
        }
        return jump;
    }
}