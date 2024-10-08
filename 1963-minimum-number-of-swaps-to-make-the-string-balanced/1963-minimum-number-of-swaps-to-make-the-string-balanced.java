class Solution {
    public static String swap(String s, int i,int j){
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    public int minSwaps(String s) {
        int bal = 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                bal++;
            }
            else if(s.charAt(i)==']'){
                bal--;
                if(bal<0){
                    int j=i+1;
                    while(j<s.length() && s.charAt(j)!=']'){
                        j++;
                    }
                    if(j<s.length()){
                        s=swap(s,j,i);
                        count++;
                    }
                    bal=0;
                }
            }
        }
        return count;
    }
}