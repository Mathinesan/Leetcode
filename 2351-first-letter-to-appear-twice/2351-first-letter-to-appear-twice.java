class Solution {
    public char repeatedCharacter(String s) {
        // for(int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         return s.charAt(i);
        //     }
        // }
        // return 0;

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && j!=i){
                    return s.charAt(i);
                }
            }
        }
        return 0;
    }
}