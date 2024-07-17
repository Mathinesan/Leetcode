class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char w: s.toCharArray()){
            if(w=='('){
                st.push(')');
            }
            else if(w=='['){
                st.push(']');
            }
            else if(w=='{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=w){
                return false;
            }
        }
        return st.isEmpty();
    }
}
