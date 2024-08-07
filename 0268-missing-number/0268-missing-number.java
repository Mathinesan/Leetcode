class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int count=0;
       int len=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==count){
            count++;
            len++;
        }else{
            return count;
        }
       }
       return nums[nums.length-1]+1;
    }
}