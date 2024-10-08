class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        backtrack(n,k,1,current,result);
        return result;
    }

    public static void backtrack(int n,int k,int start, List<Integer> current,List<List<Integer>> result){
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            backtrack(n,k,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}