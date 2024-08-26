class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5) return mainTank*10;
        int sum = mainTank;
        while(mainTank>=5){
            mainTank = (mainTank-5)+1;
            additionalTank -=1;
        }
        sum+=mainTank;
        return sum*10;
    }
}