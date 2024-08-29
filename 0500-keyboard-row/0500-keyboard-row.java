class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(check(word)){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
    
    public boolean check(String word){

        List<Character> row1 = new ArrayList<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        List<Character> row2 = new ArrayList<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        List<Character> row3 = new ArrayList<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        String lower = word.toLowerCase();
        return allchar(lower,row1) || allchar(lower,row2) || allchar(lower,row3);
    }

    public boolean allchar(String lower, List<Character> row){
        for(char i : lower.toCharArray()){
            if(!row.contains(ch)){
                return false;
            }
        }
        return true;
    }
}