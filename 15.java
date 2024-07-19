class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr2 = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        arr2.add(arr);
                    }
                }
            }
        }

        return arr2;
    
    }
}
