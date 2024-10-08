class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(String str1 : words1){
            map1.put(str1 , map1.getOrDefault(str1,0)+1);
        }
        for(String str2 : words2){
            map2.put(str2 , map2.getOrDefault(str2,0)+1);
        }
        int count = 0;
        for(String str: map1.keySet()){
            if(map1.get(str) == 1 && map2.getOrDefault(str, 0) == 1){
                count++;
            }
        }
        return count;
    }
}

