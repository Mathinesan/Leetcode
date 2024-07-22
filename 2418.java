import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] str=new String[heights.length];
        HashMap<Integer,String> hash=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hash.put(heights[i],names[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int k=0;k<names.length;k++){
            arr.add(heights[k]);
        }
          Collections.sort(arr, Collections.reverseOrder());
         String[] st=new String[names.length];
        for(int j=0;j<names.length;j++){
            st[j]=hash.get(arr.get(j));
        }
        return st;
    }
}
