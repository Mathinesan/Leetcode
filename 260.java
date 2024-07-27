import java.util.ArrayList;

class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> num = new ArrayList<>();
        int freq[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            freq[i] = 0; 
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq[i]++; 
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                num.add(nums[i]); 
            }
        }

        int[] result = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            result[i] = num.get(i);
        }

        return result; 
    
    }
}
