class Solution {
    public String finalString(String s) {
        //char[] s1 = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='i'){
                sb.reverse();
            }
        }
        String r = sb.toString();
        return r;
    }
}