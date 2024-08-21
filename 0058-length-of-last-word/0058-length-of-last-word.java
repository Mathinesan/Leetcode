class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        for(int i=s.length()-1;i>=0;i--){

            if((s.charAt(i)) == 32 && count == 0){
                continue;
            }
            else if ((s.charAt(i)) == ' ' && count!=0){
                break;
            }
            count++;
        }
        return count;
    }
}