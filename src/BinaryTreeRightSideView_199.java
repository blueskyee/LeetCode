import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/3/18.
 */
public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(_TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }

    //helper func: traver from root then go right child first.
    private void helper(_TreeNode node, List<Integer> res, int level){
        if(node == null) return;
        if(res.size() == level){
            res.add(node.val);
        }
        helper(node.right, res, level + 1);
        helper(node.left, res, level + 1);
    }
}

