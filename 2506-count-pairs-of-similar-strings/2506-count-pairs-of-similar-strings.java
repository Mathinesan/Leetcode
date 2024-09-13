class Solution {
    public int similarPairs(String[] words) {
        Map<Set<Character> ,Integer> hash = new HashMap<>();
        for(String word : words){
            Set<Character> ch = new HashSet<>();
            for(Character c : word.toCharArray()){
                ch.add(c);
            }
            hash.put(ch, hash.getOrDefault(ch,0)+1);
        }
        int pair = 0;
        for(int value : hash.values()){
            pair += value*(value-1)/2;
        }
        return pair;
    }
}