class Solution {
    public int getWinner(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> maps = new HashMap<>();
        while(count!=2){
            if(arr[0]>arr[1]){
                int temp = arr[1];
                for(int i=1;i<arr.length-1;i++){
                    arr[i] = arr[i+1];
                    count++;
                }
                arr[arr.length-1]=temp;
                maps.put(arr[0],count);
            }
            if(arr[0]<arr[1]){
                int temp = arr[0];
                arr[0] = arr[1];
                for(int i=1;i<arr.length-1;i++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = temp;
                maps.put(arr[0],count++);
            }

        }
    }
}
