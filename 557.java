class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(sb.toString());
        }

        return result.toString();
    }
}