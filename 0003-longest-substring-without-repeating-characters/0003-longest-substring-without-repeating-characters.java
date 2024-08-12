class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int start = 0;
        int move = 0;
        int max = 0;
        while(move<s.length()){
            if(!hash.contains(s.charAt(i))){
                hash.add(s.charAt(i));
                move++;
                max = Math.max(hash.size(),max);
            }
            else{
                hash.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}