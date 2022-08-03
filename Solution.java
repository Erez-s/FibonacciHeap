import javax.swing.tree.TreeNode;

class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root,int maxval){
        if(root == null){
            return 0;
        }
        int right = helper(root.left,Math.max(maxval,root.val));
        int left = helper(root.right,Math.max(maxval,root.val));
        if(root.val > maxval){
            return 1+ right + left;
        }
        return right + left;
    }
}

