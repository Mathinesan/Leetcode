public class Solution {

    public boolean buddyStrings(String s, String goal) {
        // Check if lengths are different
        if (s.length() != goal.length()) return false;

        // Case 1: The strings are the same
        if (s.equals(goal)) {
            // Check for at least one duplicate character
            Set<Character> seen = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (!seen.add(c)) {
                    return true; // Duplicate found
                }
            }
            return false; // No duplicates found
        }

        // Case 2: The strings are different
        int[] diff = new int[2];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (count == 2) {
                    return false; // More than two positions differ
                }
                diff[count++] = i;
            }
        }

        // Check if exactly two positions differ and swapping makes them equal
        return count == 2 &&
               s.charAt(diff[0]) == goal.charAt(diff[1]) &&
               s.charAt(diff[1]) == goal.charAt(diff[0]);
    }
