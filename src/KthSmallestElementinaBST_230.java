import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry on 2021/1/12.
 */
public class KthSmallestElementinaBST_230 {
    int res = 0;
    public int kthSmallest(_TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        inorder(root, k, set);
        return res;
    }

    private void inorder(_TreeNode node, int k, Set set){
        if(node == null) return;
        inorder(node.left, k, set);
        set.add(node.val);
        if(set.size() == k){
            res = node.val;
            return;
        }
        inorder(node.right, k, set);
    }
}
