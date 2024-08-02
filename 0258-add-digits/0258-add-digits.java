class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        
        int sum = num;
        
        while (sum >= 10) {
            sum = getSumOfDigits(sum);
        }
        
        return sum;
    }

    private int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
