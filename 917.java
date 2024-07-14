class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int last = s.length() - 1;

        while (start < last) {
            if (!Character.isLetter(s.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetter(s.charAt(last))) {
                last--;
                continue;
            }
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(last));
            sb.setCharAt(last, temp);
            start++;
            last--;
        }

        return sb.toString();
    }
}
