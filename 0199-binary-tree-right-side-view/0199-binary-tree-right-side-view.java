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
    public void dfs(TreeNode root, List<Integer> ans,int lvl){
        if(root==null) return ;
      if(ans.size()==lvl)  ans.add(lvl,root.val);
         dfs(root.right,ans,lvl+1);
        dfs(root.left,ans,lvl+1);
        

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(root,ans,0);
        return ans;

    }
}