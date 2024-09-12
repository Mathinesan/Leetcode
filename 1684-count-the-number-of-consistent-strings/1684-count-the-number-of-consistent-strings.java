class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            for(int j=0;j<words.length;j++){
                String word = words[j];
                for(int k=0;k<word.length();k++){
                        if(word.charAt(k) == ch){
                            continue;
                        }
                        else{
                            count++;
                            break;
                        }
                }
               
            }
        }
        return count;
    }
}