class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        int r= s.length()-1;
        for(int l=s.length()-1;l>=0;l--){
            if(s.charAt(l)=='1'){
                count+=r-l;
                r--;
            }
        }
        return count;
    }
}