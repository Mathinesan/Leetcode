class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        int max1 = 0;
        int max2 = 0;
        // int[] freq = new int[nums.length];
        // for(int i: nums){
        //     if(i%2==0){
        //         freq[i] = 1;
        //     }
        //     else{
        //         freq[i] = 0;
        //     }
        // }
        // if(!freq.contains(1)) return -1;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getKey() %2 == 0){
                max2 = entry.getValue();
            }
            if(max1<max2){
                max1 = max2;
            }
        }
        return max1;
    }
}