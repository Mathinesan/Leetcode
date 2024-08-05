class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> unique = new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     unique.add(arr[i]);
        // }
        for(String i : arr){
            unique.put(i, unique.getOfDefault(i,0)+1);
        }

        int count =0;
        for(String j : unique){
            if(unique.get(j)==1){
                count++;
                if(count == k){
                    return j;
                }
            }
        }
        return "";
        
    }
}