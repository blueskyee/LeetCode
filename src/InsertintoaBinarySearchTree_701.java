import apple.laf.JRSUIUtils;

/**
 * Created by blueskyee on 2020/11/8.
 */
public class InsertintoaBinarySearchTree_701 {
    public static void mian(String[] args) throws Exception {
        TreeNode tn = TreeNode.createBST();
        InsertintoaBinarySearchTree_701 ibst = new InsertintoaBinarySearchTree_701();
        ibst.insertIntoBST(tn, 11);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        }else{
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
