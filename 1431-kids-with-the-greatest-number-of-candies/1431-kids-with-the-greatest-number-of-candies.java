class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
            if(max<i){
                max=i;
            }
        }
        Boolean[] arr = new Boolean[candies.length];
        for(int i=0;i<arr.length;i++){
            if(candies[i]+extraCandies>=max){
                arr[i]=true;
            }
            else{
                arr[i]=false;
            }
            //List<Boolean> res = Arrays.asList(arr);
        }
        return Arrays.asList(arr);
    }
}