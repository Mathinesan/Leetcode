class Solution {
    public boolean checkString(String s) {
        HashSet<Character> hash = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)=='a'){
                        return false;
                    }
                }
            }
        }         
        return true;
    }
}