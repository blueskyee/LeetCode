import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by henry on 2021/3/6.
 */
public class MinimumDistanceBetweenBSTNodes_783 {

    int res = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    public int minDiffInBST(_TreeNode root) {
        //inorder traverse
        if(root.left != null)
            minDiffInBST(root.left);
        if(pre != Integer.MAX_VALUE)
            res = Math.min(res, root.val - pre);
        pre = root.val;
        if(root.right != null)
            minDiffInBST(root.right);
        return res;
    }
}
