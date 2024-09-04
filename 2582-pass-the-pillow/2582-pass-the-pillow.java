class Solution {
    public int passThePillow(int n, int time) {
        int count = 0;
        while(time!=0){
            for(int i=1;i<=n;i++){
                if(i<=n){
                    count = i;
                }
                time--;
                if(time == 0){
                    return count;
                }
            }
        }
        while(time!=0){
            for(int j=count;j>0;j--){
                count = j;
                time--;
                if(time == 0) return count;
            }
        }
        return 0;
    }
}