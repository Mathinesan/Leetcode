class Solution {
    public boolean isPowerOfTwo(int n) {
        double sqrt = Math.sqrt(n);
        int num = (int)sqrt;
        return num*num == n;
    }
}
