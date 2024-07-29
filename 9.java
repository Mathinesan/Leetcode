class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        StringBuilder bd = new StringBuilder(str);
        bd.reverse();
        return str.equals(bd.toString());
    }
}
