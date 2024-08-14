import java.util.Arrays;

public class SmallestDistancePair {
    
    // Function to count pairs with distance <= mid
    private static int countPairs(int[] nums, int mid) {
        int count = 0;
        int left = 0;
        
        // Use two pointers technique
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > mid) {
                left++;
            }
            count += right - left;
        }
        
        return count;
    }

    public static int smallestDistancePair(int[] nums, int k) {
        // Sort the array
        Arrays.sort(nums);
        
        // Initialize binary search bounds
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];
        
        // Perform binary search
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countPairs(nums, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        int k = 1;
        System.out.println(smallestDistancePair(nums, k));  // Output: 0
    }
}
