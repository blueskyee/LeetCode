/**
 * Created by henry on 2021/1/13.
 */
public class DeleteNodeinaBST_450 {
    public _TreeNode deleteNode(_TreeNode root, int key) {
        if(root == null)
            return root;
        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                root.val = findRightMinVal(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    private int findRightMinVal(_TreeNode node){
        int minVal = node.val;
        while(node.left != null){
            node = node.left;
            minVal = node.val;
        }
        return minVal;
    }
}
