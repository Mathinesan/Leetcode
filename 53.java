class Solution {
    public int maxSubArray(int[] nums) {
        //ArrayList<Intger> num = new ArrayList<>();
        int max = 0;
        int sum=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<=i;j++){
                for(int k=)
                sum+=nums[j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}
