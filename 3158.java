class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       HashMap< Integer, Integer> space = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        space.put(nums[i] , space.getOrDefault(nums[i],0)+1);
       }

       int res=0;
       for (int i : space.keySet()) {
            if (space.get(i) == 2) {
                res ^= i;
            }
        
       }
       return res;
    }
}
