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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>main=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return main;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>cur=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                cur.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
            main.add(cur);
        }
        return main;
        
    }
}