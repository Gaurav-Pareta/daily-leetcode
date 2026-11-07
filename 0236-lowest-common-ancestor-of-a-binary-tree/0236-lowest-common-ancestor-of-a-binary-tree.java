/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root, p, path1);
        getPath(root, q, path2);

        int i = 0;
        TreeNode lca = null;
        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) != path2.get(i)) break;
            lca = path1.get(i);

            i++;
        }

        return lca;
    }

    public boolean getPath(TreeNode root, TreeNode p, ArrayList<TreeNode> path){
        if(root == null) return false;

        path.add(root);

        if(root == p) return true;

        if(getPath(root.left, p, path) || getPath(root.right, p, path)) return true;

        path.remove(path.size() -1);
        return false;
        
    }
}