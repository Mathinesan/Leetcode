import java.util.*;

public class Solution {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < s.length();
        }

        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        if (diff.size() == 2) {
            int i1 = diff.get(0);
            int i2 = diff.get(1);
            return s.charAt(i1) == goal.charAt(i2) && 
            s.charAt(i2) == goal.charAt(i1);
        }

        return false;
    }
}
