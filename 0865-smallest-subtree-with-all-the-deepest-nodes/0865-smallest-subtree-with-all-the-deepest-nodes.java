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
    TreeNode x = new TreeNode(-1);
    int depth = 0 ;
    public int dfs(TreeNode root , int cnt){

        if(root == null){
            return cnt-1 ;
        }
        
        if(cnt >= depth){
            depth = cnt;
        }
        if(root.left == null && root.right == null){
            
            return cnt;
        }

        int l = dfs(root.left , cnt+1);
        int r = dfs(root.right , cnt+1);

        if(l == r && (l + r) == 2 *depth){
            x = root;
            return l;
        }

         if(l > r && cnt == depth -1){
            x = root.left;
            
        }

         if(l < r && cnt == depth -1){
            x = root.right;
           
        }

        if(l < r){
            return r;
        }
        if(l > r){
            return l;
        }

        return r;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
        if(root == null ){
            return null;
        }

        if(root.left == null && root.right == null){
            return root;
        }
        int s = dfs(root,1);
        depth = 0 ;
        TreeNode save = x;
        TreeNode sx = new TreeNode(-1);
        x = sx;
        return save;
        
    }
}