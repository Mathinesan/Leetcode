class Solution {
    public boolean isPowerOfTwo(int n) {
        // double sqrt = Math.sqrt(n);
        // int num = (int)sqrt;
        // return num*num == n;

        long i=1;
        while(i<n){
            i=i*2;
        }

        if(i==n){
            return true;
        }
        else{
            return false;
        }
    }
}
