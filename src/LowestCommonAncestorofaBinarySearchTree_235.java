/**
 * Created by henry on 2020/11/4.
 */
public class LowestCommonAncestorofaBinarySearchTree_235 {
    public static void main(String[] args) throws Exception {
        TreeNode input = TreeNode.createBST();
        LowestCommonAncestorofaBinarySearchTree_235 lc = new LowestCommonAncestorofaBinarySearchTree_235();

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val - p.val) * (root.val - q.val) > 0){
            root = root.val > p.val ? root.left : root.right;
        }
        return root;
    }
}
