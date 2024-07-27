class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        
        String str = String.valueOf(num);
        StringBuilder bd = new StringBuilder(str);
        bd.reverse();
        int firstReverse = Integer.parseInt(bd.toString());
        
        StringBuilder bd1 = new StringBuilder(String.valueOf(firstReverse));
        bd1.reverse();
        int secondReverse = Integer.parseInt(bd1.toString());
        
        return num == secondReverse;
    }
}
