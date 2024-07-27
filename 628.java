class Solution {
    public int maximumProduct(int[] nums) {
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            ans *= nums[i];
        }
        return ans;
    }
}
