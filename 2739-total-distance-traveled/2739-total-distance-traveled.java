class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans=0;
        while(mainTank>=5 && additionalTank>=1){
            ans+=50;
            mainTank-=5;
            mainTank+=1;
            additionalTank--;
        }
        ans+=(10*mainTank);
        return ans;
    }
}