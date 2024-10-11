class Solution {
    public String reverseWords(String s) {
        String[] res=s.split(" ");
        String r = "";
        for(int i=res.length-1;i>=0;i--){
            if(!res[i].isEmpty()){
                r+=res[i]+" ";
            }
        }
        return r.toString().trim();
    }
}