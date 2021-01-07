/**
 * Created by blueskyee on 2020/11/8.
 */
public class InsertintoaBinarySearchTree_701 {
    public static void mian(String[] args) throws Exception {
        _TreeNode tn = _TreeNode.createBST();
        InsertintoaBinarySearchTree_701 ibst = new InsertintoaBinarySearchTree_701();
        ibst.insertIntoBST(tn, 11);
    }

    public _TreeNode insertIntoBST(_TreeNode root, int val) {
        if(root == null) return new _TreeNode(val);
        if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        }else{
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
