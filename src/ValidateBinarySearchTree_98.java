/**
 * Created by henry on 2021/1/12.
 */
public class ValidateBinarySearchTree_98 {

    public boolean isValidBST(_TreeNode root) {
        return validSubTreeValue(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean validSubTreeValue(_TreeNode node, Long high, Long low){
        if(node == null) return true;
        if(node.val > low && node.val < high)
            return validSubTreeValue(node.left, Long.valueOf(node.val), low)
                    && validSubTreeValue(node.right, high, Long.valueOf(node.val));
        else
            return false;
    }
}
