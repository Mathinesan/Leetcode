class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       int count = 0;
       if(k==0) return 0;
        while(k!=0){
            for(int i=0;i<chalk.length;i++){
                k-=chalk[i];
                if(k<0) return i;
            }
        }
        return count;
    }
}