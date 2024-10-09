class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String l = (str1.length()>str2.length())?str1:str2;
        String s = (str1.length()>str2.length())?str2:str1;

        if(l.equals(s)){
            return s;
        }
        if(!l.startsWith(s)){
            return "";
        }

        return gcdOfStrings(l.substring(s.length()),s);
    }
}