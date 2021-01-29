import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by henry on 2021/1/29.
 */
public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public static void main(String[] args){

    }

    public List<List<Integer>> zigzagLevelOrder(_TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, 0, res);
        return res;
    }

    private void helper(_TreeNode root, int level, List<List<Integer>> res){
        if(root == null) return;
        if(res.size() <= level){
            List<Integer> list = new LinkedList<>();
            res.add(list);
        }
        List<Integer> list = res.get(level);
        if(level % 2 == 0){
            list.add(root.val);
        }else{
            list.add(0, root.val);
        }
        helper(root.left, level + 1, res);
        helper(root.right, level + 1, res);
    }
}
