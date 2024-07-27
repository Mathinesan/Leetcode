class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int last = str[str.length-1].length();
        return last; 

    }
}
