class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if(haystack.contains(needle)){
            int ind = haystack.indexOf(needle);
            return ind;
        }
        return -1;   
    }
}