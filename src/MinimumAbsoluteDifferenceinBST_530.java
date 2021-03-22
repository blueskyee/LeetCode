/**
 * Created by henry on 2021/3/22.
 */
public class MinimumAbsoluteDifferenceinBST_530 {

    _TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(_TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(_TreeNode node){
        if(node == null) return;
        inorder(node.left);
        if(prev != null){
            minDiff = Math.min(minDiff, node.val - prev.val);
        }
        prev = node;
        inorder(node.right);
    }

}
