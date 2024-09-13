import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey()); 
            }
        }
        return -1;
    }
}
