class Solution {
    public int maxWidthRamp(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int cont = 0;
                if(i<j && nums[i]<=nums[j]){
                    cont=nums[j]-nums[i];
                }
                if(max<cont){
                    max=cont;
                }
            }
        }
        return max;
    }
}