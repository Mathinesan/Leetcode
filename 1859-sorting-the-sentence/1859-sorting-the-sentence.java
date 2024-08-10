class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        int j = 1;
        StringBuilder bd = new StringBuilder("");
        for(int i=0;i<str.length;i++){
            for(int k=0;k<str.length;k++){
                String str1 = str[i];
                if(str1.charAt(str1.length()-1)-'0' == j){
                    str1 = str1.replace(str1.substring(str1.length()-1),"");
                    bd.append(str1);
                    j++;
                }
            
            }
        }
        return bd.toString();
    }
}