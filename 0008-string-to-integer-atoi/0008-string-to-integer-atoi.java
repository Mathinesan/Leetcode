class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        boolean neg = false;
        if (s.startsWith("-")) {
            neg = true;
            s = s.substring(1);
        } else if (s.startsWith("+")) {
            s = s.substring(1);
        }

        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                bd.append(s.charAt(i));
            } else {
                break;
            }
        }

        String str = bd.toString();
        if (str.length() == 0) {
            return 0;
        }

        // Check for potential overflow before parsing
        if (str.length() > 19) { // Length of Long.MAX_VALUE is 19 digits
            return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        long longValue = 0;
        for (char c : str.toCharArray()) {
            longValue = longValue * 10 + (c - '0');
            // Check for overflow
            if (longValue > Integer.MAX_VALUE) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        return neg ? (int) -longValue : (int) longValue;
    }
}