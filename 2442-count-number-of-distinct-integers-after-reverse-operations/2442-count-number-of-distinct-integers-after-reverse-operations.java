import java.util.HashSet;

public class Solution {
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        
        for (int num : nums) {
            hash.add(num); 
            hash.add(reverse(num)); 
        }
        
        return hash.size(); 
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10; 
            num /= 10; 
        }
        return reversed;
    }

   
}
