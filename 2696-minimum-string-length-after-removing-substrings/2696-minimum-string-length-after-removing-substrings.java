class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char letter  = s.charAt(i);
            if(st.empty()){
                st.push(letter);
                continue;
            }
            if(letter=='B' && st.peek() == 'A'){
                st.pop();
            }
            else if(letter=='D' && st.peek() == 'C'){
                st.pop();
            }
            else{
                st.push(letter);
            }
        }
        return st.size();
    }
}