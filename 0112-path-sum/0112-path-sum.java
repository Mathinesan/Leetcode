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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumpath = new Stack<>();

        path.push(root);
        sumpath.push(root.val);
        while(!path.isEmpty()){
            TreeNode value = path.pop();
            int treeval = sumpath.pop();

            if(treeval == targetSum && value.left == null && value.right == null){
                return true;
            }
            if(value.left != null){
                path.push(value.left);
                sumpath.push(value.left.val+treeval);
            }
            if(value.right != null){
                path.push(value.right);
                sumpath.push(value.right.val+treeval);
            }
        }
        return false;
    }
}