class Solution {
    public boolean isThree(int n) {
        boolean res = false;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%1==0){
                count++;
                if(count==3){
                    res=true;
                    break;
                }
            }
        }
        return res;
    }
}