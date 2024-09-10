class Solution {
     public boolean buddyStrings(String s, String goal) {
        // Check if lengths are different
        if (s.length() != goal.length()) return false;

        // Convert strings to character arrays and sort them
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = goal.toCharArray();
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            if (s.equals(goal)) {
                for (int i = 0; i < s.length(); i++) {
                    for (int j = i + 1; j < s.length(); j++) {
                        if (s.charAt(i) == s.charAt(j)) {
                            return true; 
                        }
                    }
                }
                return false; 
            }
            return true; 
        }

        return false; 
    }
}