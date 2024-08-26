class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while(left<right){
            while(left<right && !vowels.contains(ch[left])){
                left++;
            }
            while(left<right && !vowels.contains(ch[right])){
                right--;
            }
            char occ = ch[left];
            ch[left] = ch[right];
            ch[right] = occ;
            left++;
            right--;
        }
        return new String(ch);
    }

}