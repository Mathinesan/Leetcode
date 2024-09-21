class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = ((dividend > 0) ^ (divisor > 0)) ? -1 : 1;

        int div = Math.abs(dividend);
        int divisors = Math.abs(divisor);

        int quo = 0;

        while (div >= divisors) {
            div = div - divisors;
            quo++;
        }
        
        if (sign == -1) quo = -1 * quo; 
        return quo;

    }
}