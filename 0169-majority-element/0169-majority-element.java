class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int result = 0;
        int maxi = 0;
        for(int i : nums){
            hash.put(i, hash.getOrDefault(i , 0)+1);
            if(hash.get(i)>maxi){
                result = i;
                maxi = hash.get(i);
            }
        }
        return result;
    }
}