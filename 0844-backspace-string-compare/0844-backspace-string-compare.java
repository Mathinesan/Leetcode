class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder b1 = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(b1.length()>0){
                    b1.deleteCharAt(b1.length()-1);
                }
            }
            else{
                b1.append(s.charAt(i));
            }
        }
        StringBuilder b2 = new StringBuilder("");
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(b2.length()>0){
                    b2.deleteCharAt(b2.length()-1);
                }
            }
            else{
                b2.append(t.charAt(i));
            }
        }
        return b1.toString().equals(b2.toString());
    }
}