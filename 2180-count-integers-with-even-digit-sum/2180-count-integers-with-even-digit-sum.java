class Solution {

    public static boolean check(int number){
        int sum = 0;
        while(number!=0){
            int div = number%10;
            sum+=div;
            number/=10;
        }
        if(sum%2 == 0){
            return true;
        }
        else return false;
    }
    public int countEven(int num) {
        int[] n = new int[num];
        for(int i=0;i<num;i++){
            n[i] = i+1;
        }
        int count = 0;
        for(int i: n){
            if(check(i)){
                count++;
            }
        } 
        return count;
    }
}