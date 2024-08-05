public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Split sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        // Create a map to count occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Count words in the first sentence
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Count words in the second sentence
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Create a set to store uncommon words
        Set<String> uncommonWords = new HashSet<>();
        
        // Add words that appear exactly once in the map
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }
        
        // Convert the set to an array and return
        return uncommonWords.toArray(new String[0]);
    }
}
