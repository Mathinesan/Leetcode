class Solution {
    public void moveZeroes(int[] nums) {
        int[] num1 = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                num1[count]=nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num1[i];
        }
        System.out.print(nums);
    }
}