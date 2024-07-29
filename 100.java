/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode one = queue.poll();
            TreeNode two = queue.poll();

            if(one == null && two == null){
                continue;
            }
            if(one == null || two == null || one.val != two.val){
                return false;
            }

            queue.add(one.left);
            queue.add(two.left);
            queue.add(one.right);
            queue.add(two.right);
        }
        return true;
    }
}
