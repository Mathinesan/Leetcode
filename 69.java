class Solution {
   public int mySqrt(int x) {
       if (x == 0) {
           return 0;
       }

    //    int b = (int)Math.sqrt(x);
    //    return b;
       
       int l = 1;
       int r = x;
       
       while (l <= r) {
           int m = l + (r - l) / 2;
           
           if (m == (x / m)) {
               return m;
           } else if (m < (x / m)) {
               l = m + 1;
           } else {
               r = m - 1;
           }
       }
       
       return l - 1;
   }
}
