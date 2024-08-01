class Solution {
    public int sumOfEncryptedInt(int[] nums) {
          return sumOfEncryptedInts(nums); 
    }

    public static int sumOfEncryptedInts(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += encrypt(num); 
        }
        return totalSum; 
    }

    public static int encrypt(int x) {
        String strX = String.valueOf(x);
        char maxDigit = '0'; 

        for (char digit : strX.toCharArray()) {
            if (digit > maxDigit) {
                maxDigit = digit; 
            }
        }

        String encryptedString = String.valueOf(maxDigit).repeat(strX.length());
        return Integer.parseInt(encryptedString); 
    
    }
}