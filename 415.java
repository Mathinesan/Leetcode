class Solution {
    public String addStrings(String num1, String num2) {
        int sum =0 ;
        int n1 = Integer.parseInt(String.valueOf(num1));
        int n2 = Integer.parseInt(String.valueOf(num2));
        sum = n1+n2;
        return String.valueOf(sum);
    }
}
