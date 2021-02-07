import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/2/7.
 */
public class FindLargestValueinEachTreeRow_515 {

    public List<Integer> largestValues(_TreeNode root) {
        List<Integer> res = new ArrayList<>();
        addLargestValues(root, 0, res);
        return res;
    }

    private void addLargestValues(_TreeNode node, int level, List<Integer> res){
        if(node == null) return;
        if(res.size() < (level + 1)){
            res.add(node.val);
        }else{
            res.set(level, Math.max(res.get(level), node.val));
        }
        addLargestValues(node.left, level + 1, res);
        addLargestValues(node.right, level + 1, res);
    }
}
