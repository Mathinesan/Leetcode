class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int all=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
            }
            else{
                if(count>0) count--;
                else all++;
            }
        }
        return count+all;
    }
}