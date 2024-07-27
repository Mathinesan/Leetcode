class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean neg = x<0;
        String str = String.valueOf(Math.abs(x));
        StringBuilder bd = new StringBuilder(str);
        bd.reverse();

        int i = Integer.parseInt(bd.toString());

        return neg ? -i : i;
    }
}
