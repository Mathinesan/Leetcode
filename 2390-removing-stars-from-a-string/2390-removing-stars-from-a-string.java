class Solution {
    public String removeStars(String s) {
        //Input: s = "leet**cod*e"
        //Output: "lecoe"

        //String s = "leet**cod*e";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '*') {
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        Stack<Character> s2 = new Stack<>();
        while(!st.isEmpty()){
            s2.push(st.pop());
        }
        StringBuilder bd = new StringBuilder("");
        while(!s2.isEmpty()){
            bd.append(s2.pop());
        }
        return bd.toString();
    }
}
