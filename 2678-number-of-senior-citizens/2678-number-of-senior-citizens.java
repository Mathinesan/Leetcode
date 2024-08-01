class Solution {
    public int countSeniors(String[] details) {
      int count=0;
        for(int i=0;i<details.length;i++){
        int n1=details[i].charAt(11)-'0';
        int n2=details[i].charAt(12)-'0';
        int num=(n1*10)+n2;
        if(num>60){
            count++;
        }
      }
      return count;
    }
}