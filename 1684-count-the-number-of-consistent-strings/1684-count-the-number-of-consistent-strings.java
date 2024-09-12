class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hash = new HashSet<Character>();
        for(Character ch : allowed.toCharArray()){
            hash.add(ch);
        }

        int count = 0;
        for(String str : words){
            boolean consis = true;
            for(Character ch1 : str.toCharArray()){
                if(!hash.contains(ch1)){
                    consis = false;
                    break;
                }
            }
            if(consis){
                count++;
            }
        }
        return count;
    }
}