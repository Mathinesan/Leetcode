class Solution {
    public int bitwiseComplement(int n) { 
        String nums=Integer.toBinaryString(n);
        String str=nums;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<nums.length();i++){
            if(str.charAt(i)=='0'){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        String q=sb.toString();
        int j=Integer.parseInt(q,2);
        return j;
    }
}

