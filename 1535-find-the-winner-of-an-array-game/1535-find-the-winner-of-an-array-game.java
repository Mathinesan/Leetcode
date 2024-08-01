class Solution {
    public int getWinner(int[] arr, int k) {
        int currentWinner = arr[0];
        int winningStreak = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentWinner) {
                currentWinner = arr[i];
                winningStreak = 1;
            } else {
                winningStreak++;
            }
            
            if (winningStreak == k) {
                return currentWinner;
            }
        }
        
        return currentWinner;
    }
}
