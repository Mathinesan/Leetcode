class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> pres = result.get(i - 1); 
            List<Integer> row = new ArrayList<>();
            row.add(1); 
            for (int j = 1; j < i; j++) {
                row.add(pres.get(j) + pres.get(j - 1));
            }
            
            row.add(1); 
            result.add(row);
        }

        return result; 
    }
}