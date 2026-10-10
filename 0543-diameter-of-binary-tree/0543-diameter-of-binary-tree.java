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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a=levels(root.left)+levels(root.right);
        int b=diameterOfBinaryTree(root.left);
        int c=diameterOfBinaryTree(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int left=levels(root.left);
        int right=levels(root.right);
        return 1+Math.max(left,right);
    }
}