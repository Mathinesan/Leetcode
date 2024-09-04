class Solution {
    public int numberOfChild(int n, int k) {
        int pass = 0;
        int dir = 0;
        while(k-->0){
            if(pass == 0) dir=1;
            else if(pass == n-1) dir = -1;

            pass+=dir;
        }
        return pass;
    }
}