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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
          Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
         if(root==null) return ans;
        boolean flag=true;
        q.add(root);
        while(q.size()>0){
           int size=q.size();
           List <Integer> level=new ArrayList<>();
           for (int i=1;i<=size;i++){
               TreeNode temp=q.poll();
               level.add(temp.val);
               if(temp.left!=null) q.add(temp.left);
               if(temp.right!=null) q.add(temp.right);
           }
           if(!flag) Collections.reverse(level);
           ans.add(level);
           flag=!flag;
                
            }
            return ans;
    }
}