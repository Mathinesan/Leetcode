class Solution {
    public int maximumProduct(int[] nums) {
        int max = 1;
        int min =1;
        Arrays.sort(nums);
        int n = nums.length;
        max = nums[n-1]*nums[n-2]*nums[n-3];
        min = nums[0]*nums[1]*nums[n-1];

        if(max>min){
            return max;
        }
        else{
            return min;
        }
    }
}
