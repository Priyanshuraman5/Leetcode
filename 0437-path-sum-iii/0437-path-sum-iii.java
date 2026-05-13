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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int count = helper(root,targetSum);
return count+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);    }
    public int helper(TreeNode root, long tSum){
        if(root==null) return 0;

        int count = 0;

        if(root.val==tSum) count++;

        count = count + helper(root.left, tSum - root.val);
        count = count + helper(root.right, tSum - root.val);

        return count;
    }
}