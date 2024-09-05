class Solution {
    public String largestTimeFromDigits(int[] arr) {
        ArrayList<Integer> HH = new ArrayList<>();
        ArrayList<Integer> MM = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    HH.add(Integer.parseInt(""+arr[i]+arr[j]));
                    MM.add(Integer.parseInt(""+arr[i]+arr[j]));
                }
            }
        }
        int max_hh = 0;
        int max_mm = 0;
        for(int i: HH){
            if(i > 0 && i<24){
                if(max_hh < i){
                    max_hh = i;
                }
            }
            if(i > 0 && i<60){
                if(max_mm < i){
                    max_mm = i;
                }
            }
        }
        String HH1 = String.valueOf(max_hh);
        String MM1 = String.valueOf(max_mm);
      
    }
    return HH1+":"+MM1;
}