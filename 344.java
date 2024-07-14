class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
       sb.reverse();
       String s1=sb.toString();
        for(int j=0;j<s1.length();j++){
            s[j]=s1.charAt(j);
        }
    }
}