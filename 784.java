class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            res.add(s);
            return res;
        }
        helper(s.toCharArray(), res, 0);
        return res;
    }

    private void helper(char[] arr, List<String> res, int index) {
        if (index == arr.length) {
            res.add(new String(arr));
            return;
        }

        if (Character.isDigit(arr[index])) {
            helper(arr, res, index + 1);
        } else {
            arr[index] = Character.toUpperCase(arr[index]);
            helper(arr, res, index + 1);

            arr[index] = Character.toLowerCase(arr[index]);
            helper(arr, res, index + 1);
        }
    }
}
