class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder bd = new StringBuilder(str);
        bd.reverse();

        return bd.toString().equals(str);

    }
}
